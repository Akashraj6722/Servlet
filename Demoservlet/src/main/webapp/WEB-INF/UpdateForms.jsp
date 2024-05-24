<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="util.Crud" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  class="list" action="NewServlet" method="post">
<input type="hidden" name="action" value="add">
     <ul>
          <li><input type="text" name="userName" placeholder="Enter Your FirstName" required></li><br>
          <li><input type="text" name="phone"  placeholder="+91" required></li><br>
          <li><input type="email"  name="mail"placeholder="abc123@gmail.com" required></li><br>
          <li><input type="submit" value="submit">
                  
     </ul>
 
  </form>
<style>
    .list ul{
    
    list-style : none;
    }
    

</style>
</body>
</html>