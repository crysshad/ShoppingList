<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="data.*"%>
<%@ page import="interfaceP.*"%>
<%@ page import="implemtation.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>View Shopping List Page</title>
</head>
<body>
	<h1 class="w3-opacity">Shopping List</h1>
	<%
		ShoppingListImp sl = new ShoppingListImp();
		Map<String, List<ShoppingItem>> shoppingList = new HashMap<String, List<ShoppingItem>>();
		List<ShoppingItem> itemList = new ArrayList<ShoppingItem>();
		shoppingList = sl.retrieveShoppingList();
	%>
	<table class="w3-table">
		<th>All Items:</th>
		<%
			if (shoppingList != null) {

				for (Map.Entry<String, List<ShoppingItem>> entry : shoppingList.entrySet()) {

					itemList = entry.getValue();

					for (ShoppingItem item : itemList) {
		%>
		<tr>
			<td><%=item%></td>
		</tr>
		<%
			}
				}
			}
		%>
	</table>

	<form>

		<table class="w3-table">

			<th>Select a category:</th>
			<tr>
				<td><select name="categorySelection">
						<option>Food</option>
						<option>Home</option>
				</select></td>
				<td><input type="submit" value="Search" class="w3-input">
				</td>
			</tr>
			<%
				String category = request.getParameter("categorySelection");

				if (category != null) {
					itemList = sl.retrieveShoppingListByCategory(category);
					
					if (itemList == null){
						response.sendRedirect("index.jsp");
					}
					for (ShoppingItem item : itemList) {
			%>
			<tr>
				<td><%=item%></td>
			</tr>
			<%
				}
				}
				
			%>


		</table>
	</form>
	<a href="index.jsp" class="w3-bar-item w3-button">Home</a>
</body>
</html>