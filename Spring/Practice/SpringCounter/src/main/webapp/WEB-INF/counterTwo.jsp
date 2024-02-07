<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>You have visited <a href="">http://your_server</a> <c:out value="${countTwo}" /> times</h3>
<a href="/your_server">Test another visit?</a>
<button onclick="removeCountTwoFromSession()">Reset</button>

<script>
    function removeCountTwoFromSession() {
        // Remove countTwo attribute from session
        <% session.removeAttribute("countTwo"); %>
        // Optionally, you can reload the page to reflect the changes
        location.reload();
    }
</script>

</body>
</html>