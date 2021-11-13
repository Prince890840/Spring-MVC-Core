<%@page import="java.util.Date"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>My Pession</h1>

<%
  String name = (String)request.getAttribute("name"); 
  Integer roll = (Integer)request.getAttribute("roll");
  LocalDateTime time = (LocalDateTime)request.getAttribute("time");
%>
	${name }
	${time }
	
	<hr>
	${marks }
	
	<!-- 	Jstl dependency and teglib uri -->
	
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>

	<h1>Name==></h1><%=name %>
	<h2>Roll NUMBER==></h2><%=roll %>
	<h2>Current Time ==></h2><%=time.toString() %>

</body>
</html>