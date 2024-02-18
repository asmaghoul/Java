<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Show Dojo Location Ninjas</title>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center"><c:out value="${dojo.location}"/></h1>
    
    <table class="table">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ninja" items="${dojo.ninjas}">
                <tr>
                    <td><c:out value="${ninja.firstName}"/></td>
                    <td><c:out value="${ninja.lastName}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>