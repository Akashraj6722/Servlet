package com.chainsys;

public class Details {
	
	
	String name;
	int phone;
	String mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Details(String name, int phone, String mail) {
		super();
		this.name = name;
		this.phone = phone;
		this.mail = mail;
	}
	public Details() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
