<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/20/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <title>CS545 Lab3 - CalcSpringMVCFramework</title>
</head>
<body>
<header>
    <nav class="navbar navbar-dark bg-dark">
        <a class="navbar-brand" href="#">CS545 Lab3 : : : CalcSpringMVCFramework</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
        </div>
    </nav>
</header>
<main>
    <div class="container">
        <p>&nbsp;</p>
        <h2>Calculator improved using SpringMVC framework</h2>
        <div>
            <c:if test="${errors != null}">
                <c:forEach var="error" items="${errors}">
                    <p><span style="color:red;font-size:1em"><c:out value="${error}"/></span></p>
                </c:forEach>
            </c:if>

        </div>
        <form method="post" action="result">
            <div class="row justify-content-md-center">
                <div class="col-6">
                    <div class="form-group">
                        <label>Insert num1</label>
                        <input type="text" id="num1" name="num1" value="${form.num1}" class="form-control">
                    </div>
                </div>
                <div class="col-6">
                    <div class="form-group">
                        <label>Insert num2</label>
                        <input type="text" id="num2" name="num2" value="${form.num2}" class="form-control">
                    </div>
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-6">
                    <div class="form-group">
                        <label>Insert num3</label>
                        <input type="text" id="num3" name="num3" value="${form.num3}" class="form-control">
                    </div>
                </div>
                <div class="col-6">
                    <div class="form-group">
                        <label>Insert num4</label>
                        <input type="text" id="num4" name="num4" value="${form.num4}" class="form-control">
                    </div>
                </div>
            </div>
            <div class="row justify-content-md-end">
                <button id="btn" type="submit" class="btn btn-primary m-2">Calculate</button>
            </div>
        </form>
    </div>
</main>
<footer class="footer">
    <div id="footer-content">
        <span class="text-muted">Otgonbayar M : : : CS545-WAA</span>
        <span class="text-muted" style="float:right;">&copy; April 2020</span>
    </div>
</footer>
</body>
</html>
