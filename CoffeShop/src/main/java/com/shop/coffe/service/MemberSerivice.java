package com.shop.coffe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.coffe.dao.MemberDao;
import com.shop.coffe.dto.Member;

@Service
public class MemberSerivice {
	@Autowired
	MemberDao memberDao;
	
	public Member login(Member m) throws Exception{
		return memberDao.login(m);
		
	}
	
	public void insertMember(Member m) throws Exception{
		memberDao.insertMember(m);
	}
}
