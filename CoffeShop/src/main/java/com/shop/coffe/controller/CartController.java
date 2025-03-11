package com.shop.coffe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.shop.coffe.dto.Cart;
import com.shop.coffe.dto.Login;
import com.shop.coffe.dto.Member;
import com.shop.coffe.service.CartService;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("selectCart")
	public Cart selectCart(@RequestBody Member m) {
		try {
			return cartService.selectCart(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("insertCart")
	public Map<String, String> insertCart(@RequestBody Cart c) {
		
		Map<String, String> responseMap = new HashMap<>();
		try {
			System.out.println("sss : " + c.getEmail());
			cartService.insertCart(c);
			
			responseMap.put("msg", "정상적으로 담겼습니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseMap.put("msg", "오류가 발생했습니다.");
		}
		
		return responseMap;
	}
	
	@PostMapping("updateCart")
	public Map<String, String> updateCart(@RequestBody Cart c) {
		Map<String, String> responseMap = new HashMap<>();
		try {
			cartService.updateCart(c);
			
			responseMap.put("msg", "정상적으로 담겼습니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseMap.put("msg", "오류가 발생했습니다.");
		}
		
		return responseMap;
	}
}
