package com.shop.coffe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.coffe.dto.Member;
import com.shop.coffe.service.MemberSerivice;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
public class MemberController {

	@Autowired
	MemberSerivice memberService;
	
	@PostMapping("insertMember")
	public String insertMember(@RequestBody Member m) {
		System.out.println(m);
		try {
			memberService.insertMember(m);
			return "ok";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "nickname이나 email이 중복됩니다.";
		}
	}
}
