<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/29/2026
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>

<h2>${title}</h2>

<c:forEach var="book" items="${books}">
    <h4>${book}</h4>
</c:forEach>

<a href="http://localhost:8081/Library_Books_CW33_1_war/add">Add Book</a>

</body>
</html>
