<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
        <div class="edit">
        <h1>Expense Details</h1>
        <h1><a href="/">Go back</a></h1>
        </div>
        <p>Expense Name : <c:out value="${expense.expenseName}" /></p>
        <p>Expense Description: <c:out value="${expense.description}" /></p>
        <p>Vendor: <c:out value="${expense.vendorName}" /></p>
        <p>Amount Spent : $ <c:out value="${expense.amount}" /></p>
</body>
</html>