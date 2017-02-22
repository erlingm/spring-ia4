<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
<h1>Welcome to Spittles</h1>
<ul>
    <c:forEach var="spittle" items="${spittleList}">
        <li>${spittle.message}, created at ${spittle.time}</li>
    </c:forEach>
</ul>
<a href="<c:url value="/"/>">Home</a>
<a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>