package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>(); 
	public void addProduct(Product p) { 
		products.add(p); 
	} 
	public List<Product> findAll() { 
		return products; 
	}
}
