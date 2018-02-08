<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="data.*"%>
<%@ page import="interfaceP.*"%>
<%@ page import="implemtation.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Add Shopping Item Page</title>
</head>

<body>
	<h1 class="w3-center">Construct Your Shopping List</h1>
	<form action="ConfirmationPage.jsp">
		<table class="w3-table">
			<tr>
				<td id="item_input_label">Enter an item:</td>
				<td><input name="newItem" type="text" class="w3-input"></td>
			</tr>
			<tr>
				<td id="category_selection_label">Select a category:</td>
				<td><select name="category">
						<option>Food</option>
						<option>Home</option>
				</select></td>
			</tr>
		</table>

		<input type="submit" value="submit" class="w3-input">
	</form>
	<a href="ShoppingList.jsp" class="w3-bar-item w3-button">View
		Shopping List</a>
</body>
</html>