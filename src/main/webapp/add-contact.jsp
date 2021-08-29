<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="contact" class="beans.Contact" scope="request"/>
	<jsp:setProperty property="*" name="contact"/>
	<jsp:forward page="AddContact"/>
</body>
</html>