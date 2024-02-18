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
    <title>Edit A expense</title>
   
</head>
<body>

        <div class="edit">
        <h1>Edit a expense</h1>
        <h1><a href="/">Go back</a></h1>
        </div>
       
        <div>
        <form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense" class="col-md-6">
         <input type="hidden" name="_method" value="put">
        
            <div class="form-group">
                <form:label path="expenseName">expense Name:</form:label>
                <form:errors path="expenseName" class="text-danger"/>
                <form:input path="expenseName" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="vendorName">Vendor Name:</form:label>
                <form:errors path="vendorName" class="text-danger"/>
                <form:textarea path="vendorName" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="amount">Amount :</form:label>
                <form:errors path="amount" class="text-danger"/>
                <form:input path="amount" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="description">Description :</form:label>
                <form:errors path="description" class="text-danger"/>     
                <form:input type="text" path="description" class="form-control"/>
            </div>    
            <button type="submit" class="btn btn-dark">Submit</button>
        </form:form>  
    </div>
</body>
</html>