package com.shop.coffe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.shop.coffe.dto.Member;
import com.shop.coffe.dto.Product;

@Repository
public class MemberDao {
	
	@Value("${spring.datasource.driver-class-name}")
	private String DB_DRIVER;
	@Value("${spring.datasource.url}")
	private String DB_URL;
	@Value("${spring.datasource.username}")
	private String DB_USER;
	@Value("${spring.datasource.password}")
	private String DB_PW;
	
	
	public Member login(Member m) throws Exception{
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
		// Statement은 SQL Injection 취약점이 있기 때문에 PreparedStatement 사용 추천
		/*
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from member where email = '" + m.getEmail() + "' and pw = '"  + m.getPw() + "' ");
		*/
		
		PreparedStatement stmt = con.prepareStatement("select * from member where email = ? and pw = ?");
		
		stmt.setString(1, m.getEmail());
		stmt.setString(2, m.getPw());
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			String nickname = rs.getString("nickname");
			m.setNickname(nickname);
		}
		
		return m;
	}
	
	public void insertMember(Member m) throws Exception{
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
		
		PreparedStatement stmt = con.prepareStatement("insert into member(email, pw, nickname) values (?, ?, ?)");
		
		stmt.setString(1, m.getEmail());
		stmt.setString(2, m.getPw());
		stmt.setString(3, m.getNickname());
		
		int i = stmt.executeUpdate();
		
		System.out.println(i + "행이 insert 됨");
	}
}
