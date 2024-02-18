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
    <title>Expenses</title>
   
</head>
<body>
    <div class="container">
        <h1>Display Expenses</h1>
        <table class="table table-bordered table-hover table-striped table-dark">
            <thead>
                <tr>
                    <th>Expense Name</th>
                    <th>Vendor Name</th>
                    <th>Amount</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="expense" items="${allExpenses}">
                    <tr>
                       <td> <a href="/expenses/${expense.id}"><c:out value="${expense.expenseName}" /></a></td>
                        <td><c:out value="${expense.vendorName}" /></td>
                        <td>$ <c:out value="${expense.amount}" /></td>
                        <td class="edit"><a href="/expenses/edit/${expense.id}">edit</a>
                         <form action="/expenses/${expense.id}" method="post">
                         <input type="hidden" name="_method" value="delete">
                        <input type="submit" value="delete"  type="button" class="btn btn-danger">
                        </form></td>
                </c:forEach>
            </tbody>
        </table>
        
        <h1>Add a Burger</h1>
        <form:form action="/expenses" method="post" modelAttribute="expense" class="col-md-6">
            <div class="form-group">
                <form:label path="expenseName">Burger Name:</form:label>
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
                <form:input  path="description" class="form-control"/>
            </div>    
            <button type="submit" class="btn btn-dark">Submit</button>
        </form:form>  
    </div>
</body>
</html>