<%--
  Created by IntelliJ IDEA.
  User: lrandom
  Date: 6/8/23
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>
<%=request.getAttribute("name")%>
<%
    String name = (String) request.getAttribute("name");
%>
</body>
</html>
