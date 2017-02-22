<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Recent Spittles</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
<div class="listTitle">
    <h1>Recent Spittles</h1>
    <ul class="spittleList">
        <c:forEach var="spittle" items="${spittleList}">
            <li id="spittle_<c:out value="${spittle.id}"/>">
                <div class="spittleMessage">
                    <c:out value="${spittle.message}"/>
                </div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                    <span class="spittleLocation">
                    (<c:out value="${spittle.latitude}"/>,
                    <c:out value="${spittle.longitude}"/>)</span>
                </div>
            </li>
        </c:forEach>
    </ul>
    <c:if test="${fn:length(spittleList) gt 20}">
        <hr />
        <s:url value="/spittles?count=${nextCount}" var="more_url" />
        <a href="${more_url}">Show more</a>
    </c:if>
    <a href="<c:url value="/"/>">Home</a>
</div>
</body>
</html>