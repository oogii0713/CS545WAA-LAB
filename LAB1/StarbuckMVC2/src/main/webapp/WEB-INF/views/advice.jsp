<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/21/2020
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>StarbuckMVC2</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<form action="${pageContext.request.contextPath}/action/advice" method="get">
    <select name="roast">
        <option value="-">--Choose Roast--</option>
        <c:forEach var="entry" items="${roast}">
            <option value="<c:out value="${entry}"/>"><c:out value="${entry}"/></option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Submit"/>
    <br/><br/>
</form>
<br/><br/>
</body>
</html>
