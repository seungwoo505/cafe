package com.shop.coffe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.coffe.dto.Product;
import com.shop.coffe.service.ProductService;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
public class ProductController {
	@Autowired
	ProductService productService;
	
	Map<String, Object> storage = new HashMap<>();
	
	@GetMapping("getAllProduct")
	public List<Product> getAllProducts() {
		try {
			Object o = storage.get("firstPageProducts");
			if(o == null) {
				List<Product> list = productService.getAllProduct();
				storage.put("firstPageProducts", list);
			}
			return (List<Product>) o;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
