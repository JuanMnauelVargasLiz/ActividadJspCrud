<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Usuario</title>
</head>
<body>
<h1>Actualizar Usuario</h1>
	<form action="usuarioServlet?action=editar" method="post" >
		<table>
			<tr>
				<td><label>Tipo</label></td>
				<td><input type="text" name="tipoIdentificacion" value="<c:out value="${usuarioEdit.tipoidentificacion}"></c:out>" ></td>
			</tr>
                        <tr>
				<td><label>Identificacion</label></td>
				<td><input type="text" name="identificacion" value="<c:out value="${usuarioEdit.identificacion}"></c:out>" ></td>
			</tr>
			<tr>
				<td><label>Nombre</label></td>
				<td><input type="text" name="nombre" value='<c:out value="${usuarioEdit.nombre}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Apellido</label></td>
				<td><input type="text" name="apellido" value='<c:out value="${usuarioEdit.apellido}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Telefono</label></td>
				<td><input type="text" name="telefono" value='<c:out value="${usuarioEdit.telefono}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="email" value='<c:out value="${usuarioEdit.email }"></c:out>' ></td>
			</tr>
			
			<tr>
				<td><label>Fecha</label></td>
				<td><input type="text" name="fechaIngreso" value='<c:out value="${usuarioEdit.fechaCreacion }"></c:out>' ></td>
			</tr>
		</table>
	
		<input type="submit" name="registrar" value="Guardar"> 
	</form>

</body>
</html>