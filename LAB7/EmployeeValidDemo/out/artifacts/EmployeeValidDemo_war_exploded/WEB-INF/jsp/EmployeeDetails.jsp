<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title><spring:message code="emp.details.title.label"/></title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div id="global">
    <div style="padding-right:50px">
        <a href="?language=en">English</a> | <a href="?language=mn">MGL</a>
    </div>
    <section class="container">
        <h4><spring:message code="emp.details.head4.label"/></h4>
        <p>
        <h5><spring:message code="emp.details.head5.label"/></h5>
        <div class="row">
            <div class="col-md-4">
                <img alt="test" src="<c:url value="/image/${employee.id}.png"></c:url>" style="width:200px"/>
            </div>
            <div class="col-md-8">
                <p>
                    <spring:message code="emp.firstName.label"/>${employee.firstName}<br/>
                    <spring:message code="emp.lastName.label"/>${employee.lastName}<br/>
                    <spring:message code="emp.birthday.label"/>${employee.birthDate}
                </p>
            </div>
        </div>
    </section>
</div>
</body>
</html>