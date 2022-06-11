<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shawl Info</title>
</head>
<body>
	<% 
		String name = request.getParameter("user");
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String material = request.getParameter("material");
		double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));	
	%>
	
	Name: <%= name %><br>
	Brand: <%= brand %><br>
	Color: <%= color %><br>
	Material: <%= material %><br>
	Price: <%= price %><br>
	Quantity: <%= quantity %><br>
	
</body>
</html>