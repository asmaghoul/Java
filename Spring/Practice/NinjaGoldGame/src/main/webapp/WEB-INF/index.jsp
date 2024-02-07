<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- Local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>

    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1>Hello! Let's play and earn Gold!</h1>
<div>
<p>Your Gold : <c:out value="${gold}" /></p>

 </div>     
 <div>
 <form action="/" method="post">
 <input class="button" type="submit" name="reset" value="Reset Gold"/>
 </form>
 </div>     
<div class="container">
    <h1>Farm</h1>

    <form action="/" method="post">
      <h3>(earns 10-20 Golds)</h3>
         <input class="button" type="submit" name="farm" value="Find Gold"/>
    </form>
    </div>
    <div class="container">
    <h1>Cave</h1>

    <form action="/" method="post">
      <h3>(earns 5-10 Golds)</h3>
        <input class="button" type="submit" name="cave" value="Find Gold"/>
    </form>
    </div>
     <div class="container">
    <h1>House</h1>

    <form action="/" method="post">
      <h3>(earns 2-5 Golds)</h3>
         <input class="button" type="submit" name="house" value="Find Gold"/>
    </form>
    </div>
       <div class="container">
    <h1>Quest</h1>

    <form action="/" method="post">
      <h3>(earns/takes 0-50 Golds)</h3>
         <input class="button" type="submit" name="quest" value="Find Gold"/>
    </form>
    </div>
       <div class="container">
    <h1>Spa</h1>

    <form action="/" method="post">
      <h3>(looses 5-20 Golds)</h3>
         <input class="button" type="submit" name="spa" value="Find Gold"/>
    </form>
    </div>
    
    
    <h3>Activities</h3>
    <iframe src="/activities" title="Activities IFRAME"></iframe>


</body>
</html>