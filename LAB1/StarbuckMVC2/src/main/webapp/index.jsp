<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/21/2020
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StarbuckMVC2</title>
</head>
<body>
<h2>Login:</h2>
<form action="action/login" method="post">
    <label>Name: </label>
    <input type="text" name="name" size="9"/>
    <label>Password: </label>
    <input type="password" name="password" size="9"/>
    <br><br>
    <input type="submit" value="Log In"/>
</form>
</body>
</html>
