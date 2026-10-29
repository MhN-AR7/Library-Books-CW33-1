<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/29/2026
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>

<h2>${title}</h2>

<form action="add/save" method="post">
    <label>Title
        <input type="text" name="title" placeholder="Enter the title" required>
        <input type="text" name="author" placeholder="Enter the author" required>
        <input type="number" name="price" placeholder="Enter the price" min="1" step="0.1" required>

        <button type="submit">add</button>
    </label>
</form>

<a href="http://localhost:8081/Library_Books_CW33_1_war/books">All Books</a>

</body>
</html>
