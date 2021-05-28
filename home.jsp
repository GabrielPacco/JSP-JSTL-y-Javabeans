<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BIENVENIDO</title>
<style>
body{
  background-color: rgba(255,128,0);
  text-align: center;
  color: black;
  font-family: calibri;
}
</style>
</head>
<body>
<div class = "title">
<h1>Bienvenido: <c:out value="${datos.message }" /> </h1>
<p > Valor de la variable de control: <c:out value="${datos.numero }" default="mensaje de bienvenida" /><br>
<p class="p1"> Fecha: <c:out value="${fecha}" />
<p class="p1"> Sistema: <c:out value="${sistema}" />
</div>

</body>
</html>
