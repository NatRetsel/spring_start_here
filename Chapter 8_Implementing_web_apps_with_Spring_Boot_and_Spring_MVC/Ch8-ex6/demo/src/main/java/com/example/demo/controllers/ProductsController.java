package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	// we can use model class as a parameter of the controller's action directly
	// Spring knows to create the instance based on the request attributes. The model class needs to have a default constructor.
	public String addProduct(Product p, Model model ) { 
		productService.addProduct(p); 
		var products = productService.findAll(); // get list of products
		model.addAttribute("products", products);  // send to view
		return "products.html"; 
	} 
}
