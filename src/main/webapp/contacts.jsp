<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List, model.ContactList, beans.Contact"
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
			ContactList cl = new ContactList();
			List<Contact> contacts = cl.getAllContacts();
			%>
			<%
			for (Contact c : contacts) {
			%>
			<tr>
				<td><%=c.getName()%></td>
				<td><%=c.getEmail()%></td>
				<td><%=c.getNumberPhone()%></td>
				<td><a href="DelelteContact?id=<%=c.getId()%>">Delete</a></td>
			</tr>
			<%
			}
			%>

		</table>
		<br /> <br /> <a href="index.html">Back</a>
	</main>

</body>
</html>