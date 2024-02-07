<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Omikuji Card</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- Local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>

    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="card">
        <div class="card-body">
            <h1 class="card-title">Here's your Omikuji!</h1>
            <p class="card-text">
                In <c:out value="${number}" /> years you will live in <c:out value="${city}" /> with <c:out value="${personName}" /> as your roommate, <c:out value="${occupation}"  /> for a <c:out value="${thing}" />. The next time you see a ferret, you will have good luck. Also, <c:out value="${niceWord}" />
            </p>
            <a href="/omikuji" class="btn btn-primary">Go Back</a>
        </div>
    </div>
</div>
</body>
</html>
