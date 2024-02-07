<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- Local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<h1 class="mycolor">Fruit Store</h1>
<table class="table" >
    <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="thisItem" items="${fruitsFromMyController}">
            <tr>
                <td><c:out value="${thisItem.name}" /></td>
                <td><c:out value="${thisItem.price}" /></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
