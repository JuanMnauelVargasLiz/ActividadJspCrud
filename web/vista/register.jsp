<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Usuarios</title>
</head>
<body>
	<h1>Registrar Usuarios</h1>
	<form action="usuarioServlet?action=register" method="post">
		<table border="1" align="center">
		<tr>
			<td>tipo:</a></td>		
			<td><input type="text" name="tipoIdentificacion"/></td>	
		</tr>
                <tr>
			<td>identificacion:</a></td>		
			<td><input type="text" name="identificacion"/></td>	
		</tr>
		<tr>
			<td>Nombre:</a></td>		
			<td><input type="text" name="nombre"/></td>	
		</tr>
                <tr>
			<td>Apellido:</a></td>		
			<td><input type="text" name="apellido"/></td>	
		</tr>
		<tr>
			<td>Telefono:</a></td>		
			<td><input type="text" name="telefono"/></td>	
		</tr>
		<tr>
			<td>Correo:</a></td>		
			<td><input type="text" name="email"/></td>	
		</tr>
		<tr>
			<td>fecha:</a></td>		
			<td><input  type="date" name="fechaIngreso" min="01/01/2020" max="20/11/2020"/></td>	
		</tr>		
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	
	</form>
</body>
</html>