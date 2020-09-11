<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/22/20
  Time: 00:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount</title>
  </head>
  <body>
  <h1>Product Discount</h1>
  <form action="/discount" method="post">
    <label>Product Description: </label><br/><br/>
    <input type="text" name="product"><br/><br/>
    <label>Price: </label><br/><br/>
    <input type="text" name="price"><br/><br/>
    <label>Discount Percent: </label><br/><br/>
    <input type="text" name="percent" placeholder="(%)"><br/><br/>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
