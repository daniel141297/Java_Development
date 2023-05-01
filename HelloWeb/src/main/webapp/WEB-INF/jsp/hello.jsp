<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/HelloWeb/addStudent" method="post">
 <table>
 <tr>
 <input type="text" name="name"/>
 
 </tr>
 <tr>
 <input type="password" name="password"/>
 
 </tr>
 <tr>
 <input type="radio" value="M"/>
  <input type="radio" value="F"/>
 
 </tr>
 <tr>
 <input type="submit" value="submit"/>
 
 </tr>
 </table>
 </form>
</body>
</html>