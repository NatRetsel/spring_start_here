package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductsController {
    private final ProductService productService; 
	public ProductsController( ProductService productService) { 
		this.productService = productService; 
	}

	@GetMapping("/products") 
 	public String viewProducts(Model model) { 
 		var products = productService.findAll(); // get product list from service
 		model.addAttribute("products", products); //send productlist into the view
		return "products.html";
	}

	@PostMapping(path = "/products") 
	public String addProduct( @RequestParam String name, 
							@RequestParam double price, Model model ) { 
		Product p = new Product(); 
		p.setName(name); // build new product instance
		p.setPrice(price); 
		productService.addProduct(p); 
		var products = productService.findAll(); // get list of products
		model.addAttribute("products", products);  // send to view
		return "products.html"; 
	} 
}
