package model;

public class Details {
	
	
	String name;
	int id;
	String phone;
	String mail;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Details( String name, String phone, String mail,int id ) {
		super();
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.id=id;
	}
	
	public Details() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
