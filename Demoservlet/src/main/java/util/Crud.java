package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Details;

public class Crud {

    public static void insert(Details details) throws ClassNotFoundException, SQLException {
        try (Connection connection = ConnectUtil.getConnection()) {
            String insertQuery = "INSERT INTO forms(userName,phoneNumber,email,active)  VALUES (?, ?, ?,1)";
            PreparedStatement prepare = connection.prepareStatement(insertQuery);
            prepare.setString(1, details.getName());
            prepare.setString(2, details.getPhone());
            prepare.setString(3, details.getMail());
            int rows = prepare.executeUpdate();
            System.out.println("Rows inserted: " + rows);
        }
    }

    public static ArrayList<Details> read() throws ClassNotFoundException, SQLException {
        ArrayList<Details> list = new ArrayList<>();
        Connection connection = ConnectUtil.getConnection();
            String query = "SELECT * FROM forms where active='1' order by userName ";
            PreparedStatement prepare = connection.prepareStatement(query);
            ResultSet rs = prepare.executeQuery();
            while (rs.next()) {
                Details details = new Details();
                details.setId(rs.getInt("id"));
                details.setName(rs.getString("userName"));
                details.setPhone(rs.getString("phoneNumber"));
                details.setMail(rs.getString("email"));
                
                list.add(details);
            }
        
        return list;
    }

    public static void delete(int id) throws ClassNotFoundException, SQLException {
        Connection connection = ConnectUtil.getConnection();
            String query = "UPDATE forms SET active='0' WHERE id=?";
            PreparedStatement pr = connection.prepareStatement(query);
            pr.setInt(1, id);
            pr.executeUpdate();
        }
    


public static void update(String name,String phone,String mail,int id)throws ClassNotFoundException, SQLException {
	
    Connection connection = ConnectUtil.getConnection();
        String query = "UPDATE forms SET userName=?,phoneNumber=?,email=? WHERE id=?";
        PreparedStatement pr = connection.prepareStatement(query);
        pr.setString(1, name);
        pr.setString(2, phone);
        pr.setString(3, mail);
        pr.setInt(4, id);

        pr.executeUpdate();
    }
}

