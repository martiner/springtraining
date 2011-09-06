<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Tasks</title>
</head>
<body>
	<h1>Tasks</h1>
	
	<p><a href="?edit">add</a></p>
	
	<ol>
	<c:forEach items="${list}" var="i">
		<li> 
		<b><c:out value="${i.title}"/></b>
		-
		<a href="?edit=${i.id}">edit</a>
		<br>
		<c:out value="${i.text}"/>
		</li>
	</c:forEach>
	</ol>
</body>
</html>