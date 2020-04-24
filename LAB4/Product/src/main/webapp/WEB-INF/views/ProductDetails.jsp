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
    <h4><spring:message code="product.save" text="Msg not found"/></h4>

    <h5><spring:message code="product.details" text="Msg not found"/></h5>
    <spring:message code="product.name" text="Msg not found"/>${newProduct.name}<br/>
    <spring:message code="product.category" text="Msg not found"/> ${newProduct.category.name}<br/>
    <spring:message code="product.desc" text="Msg not found"/> ${newProduct.description}<br/>
    <spring:message code="product.price" text="Msg not found"/> $${newProduct.price}

    <spring:url var="listProduct" value="/listproducts" />
    <form:form action="${listProduct}" method="get">
        <input id="submit" type="submit" value="List products">
    </form:form>

</div>
</body>
</html>