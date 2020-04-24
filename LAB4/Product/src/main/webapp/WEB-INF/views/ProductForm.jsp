<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/main.css"/>">
</head>
<body>

<div id="global">
    <form:form modelAttribute="newProduct" action="product">
        <fieldset>
            <legend><spring:message code="product.title" text="Msg not found"/></legend>
            <p>
                <label for="category"><spring:message code="product.category" text="Msg not found"/></label>
                <form:select id="category" path="category.id">
                    <form:option value="0" label="--Select Category--" />
                    <form:options items="${categories}" itemLabel="name" itemValue="id"/>
                </form:select>
            </p>
            <p>
                <label for="name"><spring:message code="product.name" text="Msg not found"/></label>
                <form:input id="name" path="name" tabindex="1"/>
            </p>
            <p>
                <label for="description"><spring:message code="product.desc" text="Msg not found"/></label>
                <form:input id="description" path="description" tabindex="2"/>
            </p>
            <p>
                <label for="price"><spring:message code="product.price" text="Msg not found"/></label>
                <form:input id="price" path="price" tabindex="3"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" />
                <input id="submit" type="submit" tabindex="5" value="Add Product" />
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
