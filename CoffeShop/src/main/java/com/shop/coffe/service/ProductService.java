package com.shop.coffe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.coffe.dao.ProductDao;
import com.shop.coffe.dto.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public List<Product> getAllProduct() throws Exception {
		return productDao.getAllProduct();
	}
}
