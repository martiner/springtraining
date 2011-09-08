<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<h1>Login</h1>
<c:if test="${param.a == 'err'}"><p align="center"><b>Wrong username or password!</b></p></c:if>
<c:if test="${param.a == 'out'}"><p align="center"><b>You were logged out.</b></p></c:if>

<sec:authorize access="isAuthenticated()">
	<p align="center">Welcome <sec:authentication property="principal.username"/>. 
	<a href="/logout">Logout</a>
	</p>
</sec:authorize>

<sec:authorize access="isAnonymous()">
	<form action="/login" method="post">
	<table align="center" border="0" cellspacing="2" cellpadding="0">
	<tr><td align="right">Username:&nbsp;</td><td><input type="text" name="j_username" /></td></tr>
	<tr><td align="right">Password:&nbsp;</td><td><input type="password" name="j_password" /></td></tr>
	<tr><td></td><td><label><input type='checkbox' name='_spring_security_remember_me' /> remember me</label></td></tr>
	<tr><td></td><td><input type="submit" value="Login"></td></tr>
	</table>
	</form>
</sec:authorize>

