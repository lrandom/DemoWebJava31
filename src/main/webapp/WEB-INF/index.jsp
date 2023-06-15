<%--
  Created by IntelliJ IDEA.
  User: lrandom
  Date: 6/15/23
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<div class="container mx-auto">
    <div class="grid grid-cols-4 gap-4">
        <c:forEach items="${products}" var="product">
            <div>
                <img src="${product.getPicture()}" class="w-full" style="height:100px"/>
                <h4>${product.getName()}</h4>
                <p>${product.getPrice()}</p>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
