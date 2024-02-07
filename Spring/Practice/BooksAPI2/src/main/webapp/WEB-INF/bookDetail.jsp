<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
            <li>Title: <c:out value="${book.title}" /></li>
            <li>Language: <c:out value="${book.language}" /></li>
            <li>Description: <c:out value="${book.description}" /></li>
            <li>Number of Pages: <c:out value="${book.numberOfPages}" /></li>
            </ul>
</body>
</html>