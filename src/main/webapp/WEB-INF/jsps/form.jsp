<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Tasks</title>
</head>
<body>
	<h1>Task</h1>
	
	<form:form modelAttribute="task">
		<form:hidden path="id" />
		
		<p>Title:<br>
		<form:input path="title"/> <form:errors path="title" cssClass="errors"/></p>

		<p>Priority:<br>
		<form:radiobuttons path="prio"/> <form:errors path="prio" cssClass="errors"/></p>

		<p>Text:<br>
		<form:textarea rows="5" cols="40" path="text" /> <form:errors path="text" cssClass="errors"/></p>
		
		<input type="submit" value="Save">
	</form:form>
	
	<p><a href="task.go">back</a></p>
	
</body>
</html>