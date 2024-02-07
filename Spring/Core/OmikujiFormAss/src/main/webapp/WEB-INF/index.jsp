<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Beautiful Bootstrap Form</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- Local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>

    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Hello there!</h1>

    <form action="/omikuji/show" method="POST">
        <div class="form-group">
            <label for="number">Pick any number from 5 to 25</label>
            <input type="number" class="form-control" id="number" min="5" max="25" name="number">
        </div>

        <div class="form-group">
            <label for="city">Enter the name of any City</label>
            <input type="text" class="form-control" id="city" name="city">
        </div>

        <div class="form-group">
            <label for="personName">Enter the name of any Real Person</label>
            <input type="text" class="form-control" id="personName" name="personName">
        </div>

        <div class="form-group">
            <label for="occupation">Enter professional endeavor or hobby</label>
            <input type="text" class="form-control" id="occupation" name="occupation">
        </div>

        <div class="form-group">
            <label for="thing">Enter any type of living things</label>
            <input type="text" class="form-control" id="thing" name="thing">
        </div>

        <div class="form-group">
            <label for="niceWord">Say something nice to someone!</label>
            <textarea class="form-control" id="niceWord" name="niceWord" rows="4" cols="50">Say something nice to someone!</textarea>
        </div>
        

        <button type="submit" class="btn btn-primary" class="btn">Send</button>
    </form>
</div>

</body>
</html>
