<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 4/12/20
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Result</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <c:if test='${requestScope["products"] == null }'>
        <c:out value="Khong tim thay"></c:out>
    </c:if>
    <c:forEach items='${requestScope["products"]}' var="product" >
        <tr>
            <td>Code: </td>
            <td>${product.getId()}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${product.getDescription()}</td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td>${product.getProducer()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
