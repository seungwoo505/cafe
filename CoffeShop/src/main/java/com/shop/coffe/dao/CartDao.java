package com.shop.coffe.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shop.coffe.dto.Cart;
import com.shop.coffe.dto.Login;
import com.shop.coffe.dto.Member;

@Mapper
public interface CartDao {
	
	public Cart selectCart(Member c)throws Exception;
	
	public void insertCart(Cart c) throws Exception;
	
	public void updateCart(Cart c) throws Exception;
	
	//public void deleteCart(Cart c) throws Exception;
	
}
