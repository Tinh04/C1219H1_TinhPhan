<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 4/12/20
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Finding Product By Id</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post" action="/product?action=findById">
    ID:
    <input type="text" name="id">
    <input type="submit" value="result">
</form>
</body>
</html>
