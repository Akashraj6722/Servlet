package com.chainsys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CRUD {
	
	public static void insert(Details details) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectUtil.getConnection();
		
		String insertQuery = "insert into forms values(?, ?,?)";
		
		PreparedStatement prepare = connection.prepareStatement(insertQuery);
		prepare.setString(1, details.getName());
		prepare.setInt(2, details.getPhone());
		prepare.setString(3, details.getMail());
		
		int rows = prepare.executeUpdate();
		
		System.out.println("Rows inserted : " + rows);
	}

}
