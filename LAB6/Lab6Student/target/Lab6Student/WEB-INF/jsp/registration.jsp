<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Student</h1>
            <p>Registration</p>
        </div>
    </div>
</section>

<section class="container">
    <form:form modelAttribute="student" class="form-horizontal">
        <feildset>
            <legend>Register new student</legend>
            <form:errors path="*" cssStyle="color : red;"/>
            <div class="form-group">
                <label class="control-label col-lg-2" for="studentId">
                    <spring:message code="addStudent.form.studentId.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="id" id="studentId" class="form:input-large"/>
                    <form:errors path="id" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="firstName">
                    <spring:message code="addStudent.form.studentFname.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="firstName" id="firstName" class="form:input-large"/>
                    <form:errors path="firstName" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="lastName">
                    <spring:message code="addStudent.form.studentLname.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="lastName" id="lastName" class="form:input-large"/>
                    <form:errors path="lastName" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="email">
                    <spring:message code="addStudent.form.studenteMail.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="email" id="email" class="form:input-large"/>
                    <form:errors path="email" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="email">
                    <spring:message code="addStudent.form.studentGender.label"/>
                </label>
                <div class="col-lg-10">
                    <form:radiobutton path="gender" id="gender" value="Male"/>Male
                    <form:radiobutton path="gender" id="gender" value="Female"/>Female
                    <form:errors path="gender" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="birthday">
                    <spring:message code="addStudent.form.studentBday.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="birthday" id="birthday" class="form:input-large"/>
                    <form:errors path="birthday" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="phone">
                    <spring:message code="addStudent.form.studentPhone.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input path="phone" id="phone" class="form:input-large"/>
                    <form:errors path="phone" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-10 col-lg-offset-2">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value="Register"/>
                </div>
            </div>

        </feildset>
    </form:form>
</section>


</body>
</html>