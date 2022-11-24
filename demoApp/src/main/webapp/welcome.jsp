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
	<p>${sessionScope.title}</p>
	<p>you have visited this web site = ${sessionScope.VisitCount}
		times</p>
	<p>Creation time =${sessionScope.creationTime}</p>
	<p>Time of last access =${sessionScope.lastAccessTimeHere}</p>
</body>
</html>
