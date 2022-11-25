<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>welcome ${requestScope.uname}</p>
	<p>${requestScope.phone}</p>
	<p>${requestScope.DOB}</p>
	<p>${requestScope.li[0]}</p>
	<p>${requestScope.li[1]}</p>
	<p>${requestScope.li[2]}</p>
	<h1> fetch list elements using JSTL tags</h1>
	<c:forEach var="hs" items="${requestScope.li}">
		<p>${hs}</p>
	</c:forEach>
	
	<h1> fetch key and value from map</h1>
	<c:forEach var="entry" items="${requestScope.mp}">
	   <p>${entry.key}:${entry.value} </p>
	</c:forEach>
	
	<h1>Fetching list from another list</h1>
	<c:forEach var="x" items="${requestScope.LI}">
	  <c:forEach var="y" items="${x}">
	  <p> ${y}</p>
	  </c:forEach>
	</c:forEach>
	
	<c:redirect url="https://www.google.com/"></c:redirect>
	
	
</body>
</html>