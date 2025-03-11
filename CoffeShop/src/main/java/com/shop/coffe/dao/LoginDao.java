package com.shop.coffe.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shop.coffe.dto.Login;

@Mapper
public interface LoginDao {
	public void insertToken(Login login) throws Exception;

	public void deleteToken(String token) throws Exception;
	
	public Login selectToken(Login login) throws Exception;
}
