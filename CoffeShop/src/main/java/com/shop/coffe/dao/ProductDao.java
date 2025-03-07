package com.shop.coffe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.coffe.dto.Product;

@Mapper
public interface ProductDao {
	
	public List<Product> getAllProduct() throws Exception;
}
