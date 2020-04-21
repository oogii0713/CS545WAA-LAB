<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/21/2020
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>StarbuckMVC2</title>
</head>
<body>
    <h2>Login Successful</h2>
    <form action="${pageContext.request.contextPath}/action/login" method="get">
        <input type = "submit" value = "Back">
    </form>
</body>
</html>
