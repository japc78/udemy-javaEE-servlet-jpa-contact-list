<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List, beans.Contact"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />
<title>Insert title here</title>
</head>
<body>
	<main>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Phone Number</th>
				<th></th>
			</tr>
			<%
			List<Contact> contacts =(List<Contact>) request.getAttribute("contacts");
			%>
			<%
			for (Contact c : contacts) {
			%>
			<tr>
				<td><%=c.getName()%></td>
				<td><%=c.getEmail()%></td>
				<td><%=c.getPhoneNumber()%></td>
				<td><a href="Controller?option=doDelete&?id=<%=c.getId()%>">Delete</a></td>
			</tr>
			<%
			}
			%>

		</table>
		<br /> <br /> <a href="Controller?option=toHome">Back</a>
	</main>

</body>
</html>