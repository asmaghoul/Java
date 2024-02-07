<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
<title><c:out value="${title}"/></title>
</head>
<body>
<%  
    String pageNameOne = "date";  
%>
    <input type="button" value="Date Template" onclick="redirectPage('<%=pageNameOne%>')" style="margin-right: 200px;" />
<%     String pageNameTwo = "time";  
%>
    <input type="button" value="Time Template" onclick="redirectPage('<%=pageNameTwo%>')" style="margin-left: 200px;" />

</body>
</html>