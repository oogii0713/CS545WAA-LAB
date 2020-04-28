<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<c:choose>
    <c:when test="${userInfo == null}">
        <form action="login" method="post">
            <p>Login: </p>
            <p> Name : <input type="text" id="name" name="name"/></p>
            <p> Password : <input type="password" id="password" name="password"/></p>
            <p><input type="submit" value="login"/></p>
        </form>
    </c:when>
    <c:otherwise>
        <h3> Welcome ${userInfo.name} | <a href="logout">Logout</a></h3>

        <h2>Ask for advice about your favorite roast:</h2>

        <form action = "display" method="post">
            <select name="roast"   >

                <c:forEach var="roast" items="${roasts}">
                    <option value="${roast.value}" > ${roast.key}</option>
                </c:forEach>

            </select>

            <p><input type="submit" value = "Submit"/></p>
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>