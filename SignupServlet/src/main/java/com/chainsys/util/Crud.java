package com.chainsys.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.model.Info;


public class Crud {
	 public static void insert(Info info) throws ClassNotFoundException, SQLException {
	        try (Connection connection = ConnectUtil.getConnection()) {
	            String insertQuery = "INSERT INTO signupDetails VALUES (?, ?, ?)";
	            PreparedStatement prepare = connection.prepareStatement(insertQuery);
	            prepare.setString(1, info.getName());
	            prepare.setString(2, info.getPhone());
	            prepare.setString(3, info.getPass());
	            int rows = prepare.executeUpdate();
	            System.out.println("Rows inserted: " + rows);
	        }
	    }
	 
	 public static boolean search(String name,String pass) throws ClassNotFoundException, SQLException {
//       ArrayList<Search> books = new ArrayList<>();

       Connection connect = ConnectUtil.getConnection();
       String query = "SELECT userName and pass FROM signupDetails WHERE userName='?' and pass='?'";
       PreparedStatement pr = connect.prepareStatement(query);

       pr.setString(1, name );
       pr.setString(2, pass );

       ResultSet rs = pr.executeQuery();
       
       while(rs.next()) {
    	   
    	   return true;
    	   
    	   
       }
       return false;
	
     
   }
	 

}
