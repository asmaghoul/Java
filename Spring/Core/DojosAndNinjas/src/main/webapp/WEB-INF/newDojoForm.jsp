<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container mt-5">
        <h1>New Dojo</h1>
        <form:form action="/dojos" method="post" modelAttribute="dojo" class="mt-4">

            <div class="mb-3">
                <form:label path="location" class="form-label">Name :</form:label>
                 <form:errors cssClass="error-message" path="location"/>
                <form:input path="location" class="form-control"/>
            </div>
            
            <button type="submit" class="btn btn-primary">Submit</button>
            
        </form:form>
    </div>
</body>
</html>