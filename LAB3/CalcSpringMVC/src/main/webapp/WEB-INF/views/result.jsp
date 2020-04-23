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
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script defer src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script defer src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <title>CS545 Lab3 - CalcSpringMVCFramework</title>
</head>
<body>
<header>
    <nav class="navbar navbar-dark bg-dark">
        <a class="navbar-brand" href="calculator">CS545 Lab3 : : : CalcSpringMVCFramework</a>
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
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="form-group">
                    <label>Sum of num1 and num2</label>
                    <input type="text" id="sum" name="sum" value="${result.sum}"  class="form-control" disabled/>
                </div>
            </div>
            <div class="col-4">
                <div class="form-group">
                    <label>Product of num3 and num4</label>
                    <input type="text" id="product" name="product" value="${result.product}" class="form-control" disabled/>
                </div>
            </div>
        </div>
        <form action="calculator">
        <div class="row justify-content-md-end">
            <button id="btn" type="submit" class="btn btn-primary m-2">Back</button>
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
