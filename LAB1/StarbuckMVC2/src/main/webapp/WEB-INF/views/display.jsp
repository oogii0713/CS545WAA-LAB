<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/21/2020
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>StarbuckMVC2</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/action/login" method="get">
    <h2>Starbuck's ${fn:toUpperCase(roast)} Roast Coffees:</h2>
    <table>
    <c:forEach var="entry" items="${advice}" varStatus="loopCounter">
        <c:choose>
            <c:when test="${loopCounter.count % 2 == 0}">
                <tr style="background-color:cyan"><td><c:out value="${entry}"/></td></tr>
            </c:when>
            <c:otherwise>
                <tr style="background-color:yellow"><td><c:out value="${entry}"/></td></tr>
            </c:otherwise>
        </c:choose>
    </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>
<br/><br/>
</body>
</html>