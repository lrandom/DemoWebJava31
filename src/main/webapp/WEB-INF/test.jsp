<%--
  Created by IntelliJ IDEA.
  User: lrandom
  Date: 6/8/23
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>

<!--in noi dung ra man hinh-->
<c:forEach items="${names}" var="name">
    <div>${name}</div>
    <c:out value="${name}"/>
</c:forEach>

<c:if var="name" test="${name == 'long'}">
    <div>long</div>
</c:if>

<c:choose>
    <c:when test="${name == 'long'}">
        <div>long</div>
    </c:when>
    <c:otherwise>
        <div>khong phai long</div>
    </c:otherwise>
</c:choose>

<%--<c:redirect url="http://google.com"/>--%>

<c:url var="url" value="http://google.com">
    <c:param name="name" value="long"/>
</c:url>

<a href="${url}">google</a>
</body>
</html>
