<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 4/12/20
  Time: 00:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <button><a href="/product?action=create">Create new product</a></button>
</p>
<p>
    <button><a href="/product?action=findById">Find by id</a></button>
</p>
<p>
    <button><a href="/product?action=findByName">Find by name</a></button>
</p>
<table border="1">
    <tr>
        <td>Code</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
    </tr>
    <c:forEach items='${requestScope["product"]}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/product?action=detail&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/product?action=update&id=${product.getId()}">Update</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
