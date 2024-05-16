package com.chainsys;

public class register {
	
	
	String name;
	String dob;
	String mail;
	String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public register (String name, String dob, String mail, String pass) {
		super();
		this.name = name;
		this.dob = dob;
		this.mail = mail;
		this.pass = pass;
	}
	
	public register () {
		
	}
	
	
	
	
	

}
