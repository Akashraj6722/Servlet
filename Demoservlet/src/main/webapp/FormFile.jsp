<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Details" %>
    <%@ page import="java.util.ArrayList" %>
    
    <%@ page import ="util.Crud" %>
    <%@ page import="java.sql.SQLException
    " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css"></style>
</head>
<body>

<% 

ArrayList<Details> list=(ArrayList<Details>)request.getAttribute("rs");

%>

<div class="box">
<table >
<tr>
   <th>Name</th>
   <th>Phone</th>
   <th>Mail</th>
</tr>
 <% 

 if(list !=null){
 
  for( Details values:list){
              
            %>
            <tr>
                <td><%= values.getName()  %></td>
                <td><%= values.getPhone() %></td>
                <td><%= values.getMail()%></td>
                <td>
                <form action="NewServlet" method="post">
                <input type="hidden" name="action" value="delete" >
                <input type="hidden" name="deleteThis" value="<%=values.getId() %>">
                <button type="submit">Delete</button>
             
                </form>
                </td>
                <%--  <td>
                <form action="NewServlet" method="post">
                <input type="hidden" name="action" value="update" >
                <input type="hidden" name="updateThis" value="<%= %>">
                <button type="submit">Delete</button>
             
                </form>
                </td> --%>
            </tr>
            <%
 }
 }
  else{
	  
  }
               
            %>



</table>
</div>
  <style>
        
        *{
              margin: 0%;
              padding: 0%;
              box-sizing: border-box;
        }

        .delete{
            padding: 10px;
            color:aliceblue;

            font-weight: bold;
            margin-left: 22px;
            background-color: red;
            
            text-decoration: none;
        }
        .update{
            padding: 10px;
            color:aliceblue;
            font-weight: bold;
            margin-left: 35px;

            background-color: rgb(32, 219, 32);
            width: 100px;
            text-decoration: none;

        }
        
         a:hover{

            color: black;

         }


         table,th,td {
            border:solid  black 2px;
            border-collapse: collapse;
            
            }
            
            .box{
            margin-left: 30%;
            margin-top: 5%;
            
            
            }

            body{
                background-color: blanchedalmond;
            }
        
        </style>
</body>
</html>