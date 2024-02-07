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
    <title>Edit A Burger</title>
   
</head>
<body>

        
        <h1>Edit a Burger</h1>
        <div>
        <form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger" class="col-md-6">
         <input type="hidden" name="_method" value="put">
        
            <div class="form-group">
                <form:label path="burgerName">Burger Name:</form:label>
                <form:errors path="burgerName" class="text-danger"/>
                <form:input path="burgerName" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="restaurantName">Restaurant Name:</form:label>
                <form:errors path="restaurantName" class="text-danger"/>
                <form:textarea path="restaurantName" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="rating">Rating :</form:label>
                <form:errors path="rating" class="text-danger"/>
                <form:input path="rating" class="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="notes">Notes :</form:label>
                <form:errors path="notes" class="text-danger"/>     
                <form:input type="text" path="notes" class="form-control"/>
            </div>    
            <button type="submit" class="btn btn-dark">Submit</button>
        </form:form>  
    </div>
</body>
</html>
