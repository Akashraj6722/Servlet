<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="model.Details" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Details details = new Details(); %>

<table>
<tr>
   <th>Name</th>
   <th>Phone</th>
   <th>Mail</th>
</tr>
<% ArrayList<Details> list=(ArrayList<Details>)request.getAttribute("values"); %>
<% for(Details list1:list){ %>

<tr>
     <td><%= list1.getName() %></td>
      <td><%=list1.getPhone()  %></td>
      <td><%= list1.getMail() %></td>
</tr>
<%} %>
</table>

</body>
</html>