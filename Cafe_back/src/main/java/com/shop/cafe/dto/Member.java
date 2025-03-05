package com.shop.cafe.dto;

import java.util.Date;

public class Member {
	private String email, pw, nickname;
	private Date resistDate;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getResistDate() {
		return resistDate;
	}
	public void setResistDate(Date resistDate) {
		this.resistDate = resistDate;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String email, String pw, String nickname, Date resistDate) {
		super();
		this.email = email;
		this.pw = pw;
		this.nickname = nickname;
		this.resistDate = resistDate;
	}
	@Override
	public String toString() {
		return "Member [email=" + email + ", pw=" + pw + ", nickname=" + nickname + ", resistDate=" + resistDate + "]";
	}
}
