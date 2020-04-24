<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/main.css"/>">
</head>
<body>
<div id="global">
    <h2><spring:message code="product.listTitle" text="Msg not found"/></h2>


    <table>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
        </tr>

        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.category.name}</td>
                <td>${product.description}</td>
            </tr>
        </c:forEach>
    </table>


    <spring:url var="product" value="/product" />
    <form:form action="${product}" method="get">
        <input id="submit" type="submit" value="Add product">
    </form:form>

</div>
</body>
</html>