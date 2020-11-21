<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrar Usuarios</title>
</head>
<body>
	<h1>Lista  Usuarios</h1>
	<table>
		<tr>
			<td><a href="usuarioServlet?action=index" >Ir al menú</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td> ID</td>
		 <td> TIPO</td>
		 <td> IDENTIFICACION</td>
		 <td>NOMBRE</td>
		 <td>APELLIDO</td>
		 <td>TELEFONO</td>
		 <td>EMAIL</td>
                 <td>FECHA</td>
		</tr>
		<c:forEach var="usuario" items="${listaUser}">
			<tr>
				<td><c:out value="${usuario.userId}"/></td>
				<td><c:out value="${usuario.tipoidentificacion}"/></td>
				<td><c:out value="${usuario.identificacion}"/></td>
				<td><c:out value="${usuario.nombre}"/></td>
				<td><c:out value="${usuario.apellido}"/></td>
				<td><c:out value="${usuario.telefono}"/></td>
                                <td><c:out value="${usuario.email}"/></td>
                                <td><c:out value="${usuario.fechaCreacion}"/></td>
				<td><a href="usuarioServlet?action=showedit&identificacion=<c:out value="${usuario.identificacion}" />">Editar</a></td>
				<td><a href="usuarioServlet?action=eliminar&id=<c:out value="${usuario.identificacion}"/>">Eliminar</a> </td>				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>