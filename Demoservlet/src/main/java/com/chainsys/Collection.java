package com.chainsys;

import java.util.ArrayList;

public class Collection {  
	
	

	ArrayList<register> list=new ArrayList<>();
	
	
	public void details(String userName, String dob, String mail, String pass) {
		

		register userRegister=new register(userName, dob, mail, pass);
//		userRegister.setName(userName);
//		userRegister.setDob(dob);
//		userRegister.setMail(mail);
//		userRegister.setPass(pass);
		
			
		list.add(userRegister);
		
	}
	public ArrayList<register> getData(){
		return list;
	}

}
//