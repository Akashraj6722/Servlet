<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chainsys.register" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>   
 <Style type="text/css">
    table,th,td {
    border:solid  black 2px;
    border-collapse: collapse;
    
    }
   
    </Style>

</head>
<body>
    <table >
        <tr>
            <th>Name</th>
            <th>D.O.B</th>
            <th>Mail</th>
            <th>Password</th>
        </tr>
        <% 
            ArrayList<register> values = (ArrayList<register>) request.getAttribute("list");
            for (register values1 : values) {
        %>
        <tr>
            <td><%= values1.getName() %></td>
            <td><%= values1.getDob() %></td>
            <td><%= values1.getMail() %></td>
            <td><%= values1.getPass() %></td>
        </tr>
        <% } %>
    </table>
    
    
</body>
</html>
