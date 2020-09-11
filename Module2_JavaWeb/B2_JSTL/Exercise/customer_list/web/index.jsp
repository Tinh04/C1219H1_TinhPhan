<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/25/20
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Customer List</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <th>Name</th>
      <th>Birthday</th>
      <th>Address</th>
      <th>Image</th>
    </tr>
    <c:forEach items='${requestScope.customer}' var="customer" >
    <tr>
      <td>${customer.name}</td>
      <td>${customer.address}</td>
      <td>${customer.birthday}</td>
      <td><img src='Image/${customer.image}' width="20%" align="center"></td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
