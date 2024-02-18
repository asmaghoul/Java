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
	<meta charset="UTF-8">
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Create New Ninja</title>
</head>
<body>

<div class="container mt-5">
    <h1>New Ninja</h1>
    <form:form action="/ninjas" method="post" modelAttribute="ninja">

        <div class="form-group">
            <form:label path="firstName">First Name:</form:label>
             <form:errors cssClass="error-message" path="firstName"/>
            <form:input path="firstName" class="form-control"/>
        </div>

        <div class="form-group">
            <form:label path="lastName">Last Name:</form:label>
             <form:errors cssClass="error-message" path="lastName"/>
            <form:input path="lastName" class="form-control"/>
        </div>

        <div class="form-group">
            <form:label path="age">Age:</form:label>
             <form:errors cssClass="error-message" path="age"/>
            <form:input path="age" class="form-control"/>
        </div>

        <div class="form-group">
            <form:label path="dojo">Dojo:</form:label>
            <form:select path="dojo" class="form-control">
                <c:forEach var="eachDojo" items="${dojos}">
                    <option value="${eachDojo.id}"><c:out value="${eachDojo.location}"/></option>
                </c:forEach>
            </form:select>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

    </form:form>
</div>
	
</body>
</html>