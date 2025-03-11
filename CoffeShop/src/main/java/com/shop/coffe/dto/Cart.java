package com.shop.coffe.dto;

import java.util.Arrays;

public class Cart {
	private String email, prodcode;
	private int price;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String email, String prodcode, int price) {
		super();
		this.email = email;
		this.prodcode = prodcode;
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProdcode() {
		return prodcode;
	}

	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [email=" + email + ", prodcode=" + prodcode + ", price=" + price + "]";
	}
}
