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
Hello! Let's explore books!
<table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Language</th>
                <th>Description</th>
                <th># Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${allbooks}">
                <tr>
                    <td><c:out value="${book.id}" /></td>
                    <td><a href="/books/${book.id}"><c:out value="${book.title}" /></a></td>
                    <td><c:out value="${book.language}" /></td>
                    <td><c:out value="${book.description}" /></td>
                    <td><c:out value="${book.numberOfPages}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>