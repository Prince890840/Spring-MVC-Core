<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Rule My IT-World</title>
</head>
<body>
	<h1>My GirlFriends</h1>
	<h2>My Rule </h2>
	
	<%	String name = (String)request.getAttribute("name"); 
		List<String> friendsList = (List<String>)request.getAttribute("friendslist");
	%>
	<h1>Welcome ${name }</h1>
	<h1>Name is -> <%=name %></h1>
	
	<%for(String s:friendsList) 
	{
		out.println(s);
	}%>
	
</body>
</html>