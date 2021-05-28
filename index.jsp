<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
  background-color: rgba(22,147,73);
  text-align: center;
  color: black;
  font-family: calibri;
}
</style>
</head>
<body>
<h1>PRACTICA 4</h1>
<form action="helloServlet" method="post">
    <div class = "title"> <h2>RELLENE ESPACIOS</h2></div> 
    <div class = "personal"><p class = "p1">INGRESE NOMBRE: <input type = "text" name = "message" size ="25">
    <br> <p class = "p1">INGRESE NUMERO DE CONTROL: <input type = "text" name = "numero" size ="5"><br><br>
    <input type = "submit" value ="enviar">
    </div>

</form>
</body>
</html>
