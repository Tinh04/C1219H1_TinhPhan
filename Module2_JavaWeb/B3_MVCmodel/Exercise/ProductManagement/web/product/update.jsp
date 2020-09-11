<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 4/12/20
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updating Product</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        ${requestScope["message"]}
    </c:if>
</p>
<p>
    <a href="/product" >Back to product list</a>
</p>
<form method="post" >
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Code: </td>
                <td>${requestScope["product"].getId()}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <th>Price</th>
                <td><input type="text" name="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <th>Description</th>
                <td><input type="text" name="description" value="${requestScope["product"].getDescription()}"></td>
            </tr>
            <tr>
                <th>Producer</th>
                <td><input type="text" name="producer" value="${requestScope["product"].getProducer()}"></td>
            </tr>
            <td></td>
            <td><input type="submit" value="Update product"></td>
        </table>
    </fieldset>
</form>
</body>
</html>
