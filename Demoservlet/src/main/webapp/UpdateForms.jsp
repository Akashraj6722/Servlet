<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  class="list" action="NewServlet" method="post">
  <input type="hidden " name="id" value="<%=request.getParameter("id") %>">
     <ul>
          <li><input type="text" name="userName"  required></li><br>
          <li><input type="text" name="phone"   required></li><br>
          <li><input type="email"  name="mail"  required></li><br>
          
          <li><input type="hidden" name="action" value="update">
          <input type="hidden" name="id" value= "<%= request.getParameter("id")%>">
         <button type="submit"> Update</button></li>
                  
     </ul>
 
  </form>
<style>
    .list ul{
    
    list-style : none;
    }
    

</style>
</body>
</html>