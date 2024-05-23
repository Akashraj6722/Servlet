package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Details;



public class Crud {
	
	static ArrayList<Details> list= new ArrayList<Details>();
	
	public static void insert(Details details) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectUtil.getConnection();
		
		String insertQuery = "insert into forms values(?,?, ?,?)";
		
		PreparedStatement prepare = connection.prepareStatement(insertQuery);
		prepare.setInt(1, details.getId());
		prepare.setString(2, details.getName());
		prepare.setString(3, details.getPhone());
		prepare.setString(4, details.getMail());
		
		int rows = prepare.executeUpdate();
		
		System.out.println("Rows inserted : " + rows);
	}
	
	
	public static ArrayList<Details> read() throws ClassNotFoundException, SQLException {
		
        Connection connection = ConnectUtil.getConnection();
        
		String Query = "Select name1 ,phone1,mail1 from forms";
		PreparedStatement prepare = connection.prepareStatement(Query);
		
		ResultSet rs=prepare.executeQuery();
		while(rs.next()) {
			Details details = new Details();
//			details.setId(rs.getInt("id"));
			details.setName(rs.getString("name1"));
			details.setPhone(rs.getString("phone1"));
			details.setMail(rs.getString("mail1"));
			list.add(details);

		}
//		list.add(details);



		return list;
		
		
		
	}
	
	
	public static void delete(int id) throws ClassNotFoundException, SQLException {
		
		Connection connection =ConnectUtil.getConnection();
		 String query="delete from forms where id=?";
		PreparedStatement pr=connection.prepareStatement(query);
		
		Details details = new Details();
		
		pr.setInt(1,id);
		pr.executeUpdate();
		
		
		
	}
}
			
			
		
		
		
	
	
		
		
		
		
		
		
		
		
		
	


