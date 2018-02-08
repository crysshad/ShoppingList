<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="data.*"%>
<%@ page import="interfaceP.*"%>
<%@ page import="implemtation.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Confirmation Page</title>
</head>
<body>
	<%
		String category = request.getParameter("category");
		String item = request.getParameter("newItem");
		ShoppingListImp sl = new ShoppingListImp();
		StringBuilder message = null;
		try{
		
		message = sl.addItem(category, item);
		}
		catch(Exception e){
			response.sendRedirect("index.jsp");
		}
		
		/* if (category != null && item != null) {
			message = sl.addItem(category, item);
		} else {
			response.sendRedirect("index.jsp");
		} */
	%>

	<div class="w3-panel w3-blue"><%=message%></div>
	<a href="index.jsp" class="w3-bar-item w3-button">Add more items</a>
	<a href="ShoppingList.jsp" class="w3-bar-item w3-button">View
		Shopping List</a>
</body>
</html>