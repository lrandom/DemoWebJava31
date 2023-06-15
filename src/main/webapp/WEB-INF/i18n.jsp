<%--
  Created by IntelliJ IDEA.
  User: lrandom
  Date: 6/15/23
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@taglib prefix="ct" uri="luan.test" %>
<html>
<head>
    <title>Title</title>
</head>
<fmt:setLocale value="${lang}"/>
<fmt:setBundle basename="main"/>
<body>

<div style="display: flex;gap:2px; justify-content: center;align-items: center">
    <a href="?lang=vi_VN">Việt</a>
    <a href="?lang=en">Anh</a>
    <a href="?lang=ja_JP">Nhật</a>
</div>

<p>
    <fmt:message key="Hello"/>
    <fmt:message key="Hi"/>
</p>

<ct:BlockSwearWord content="damn hihi shit damn"/>

</body>
</html>
