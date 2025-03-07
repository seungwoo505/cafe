package com.shop.coffe.controller;

import java.util.HashMap;
import java.util.Map;

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
	
	@PostMapping("login")
	public Map<String, String> login(@RequestBody Member m){
		System.out.println(m);
		Map<String, String> responseMap = new HashMap<>();
		
		try {
			 m = memberService.login(m);
			 
			 if(m != null) {
				 String nickname = m.getNickname();
				 
				 if(nickname != null && !nickname.trim().equals("")) {
					 responseMap.put("nickname", nickname);
				 }else {
					 responseMap.put("msg", "다시 로그인해주세요");
				 }
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			responseMap.put("msg", "다시 로그인해주세요");
		}
		return responseMap;
	}
	
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
