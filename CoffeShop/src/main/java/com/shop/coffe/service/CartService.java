package com.shop.coffe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.coffe.dao.CartDao;
import com.shop.coffe.dao.LoginDao;
import com.shop.coffe.dto.Cart;
import com.shop.coffe.dto.Login;
import com.shop.coffe.dto.Member;

@Service
public class CartService {
	@Autowired
	CartDao cartDao;
	
	public Cart selectCart(Member m) throws Exception{
		Cart c = cartDao.selectCart(m);
		
		if(c != null && c.getProdcode() != null) {
			return c;
		}else {
			return null;
		}
	}
	
	public void insertCart(Cart c) throws Exception{
		cartDao.insertCart(c);
	}
	
	public void updateCart(Cart c) throws Exception{
		cartDao.updateCart(c);
	}

}
