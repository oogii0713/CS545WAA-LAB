<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>
        <spring:message code="addEmp.form.title.label"/>
    </title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>

<div id="global">
    <div class="pull-right" style="padding-right:50px">
        <a href="?language=en">English</a> | <a href="?language=mn">MGL</a>
    </div>
    <form:form modelAttribute="employee" action="employee_save" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend><spring:message code="addEmp.form.title.label"/></legend>
            <p>
                <form:errors path="*" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="id"><spring:message code="addEmp.form.empId.label"/></label>
                    <form:input path="id" id="id"/>
            <div style="text-align: center;">
                <form:errors path="id" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="firstName"><spring:message code="emp.firstName.label"/></label>
                    <form:input path="firstName"/>
            <div style="text-align: center;">
                <form:errors path="firstName" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="lastName"><spring:message code="emp.lastName.label"/></label>
                    <form:input path="lastName"/>
            <div style="text-align: center;">
                <form:errors path="lastName" cssStyle="color : red;"/>
            </div>
            </p>

            <p>
                <label for="birthDate"><spring:message code="emp.birthday.label"/></label>
                <form:input path="birthDate" id="birthDate"/>
                <form:errors path="birthDate" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="salaryLevel"><spring:message code="addEmp.form.empSalary.label"/></label>
                    <form:input path="salaryLevel" id="salaryLevel"/>
            <div style="text-align: center;">
                <form:errors path="salaryLevel" cssStyle="color : red;"/>
            </div>
            </p>
            <h4><spring:message code="addEmp.form.head4.label"/></h4>
            <p>
                <label for="street"><spring:message code="emp.Address.street.label"/></label>
                    <form:input path="address.street" id="street"/>
            <div style="text-align: center;">
                <form:errors path="address.street" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="state"><spring:message code="emp.Address.state.label"/></label>
                    <form:input path="address.state" id="state"/>
            <div style="text-align: center;">
                <form:errors path="address.state" cssStyle="color : red; "/>
            </div>
            </p>
            <p>
                <label for="zipCode"><spring:message code="emp.Address.zipCode.label"/></label>
                    <form:input path="address.zipCode" id="zipCode"/>
            <div style="text-align: center;">
                <form:errors path="address.zipCode" cssStyle="color : red; "/>
            </div>
            </p>
            </p>
            <div>
                <label for="image"><spring:message code="addEmp.form.image.label"/></label>
                <form:input path="image" id="image" type="file" class="form:input-large" />
            </div>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4" value=<spring:message code="addEmp.form.reset.label"/>>
                <input id="submit" type="submit" tabindex="5" value=<spring:message code="addEmp.form.add.label"/>>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
