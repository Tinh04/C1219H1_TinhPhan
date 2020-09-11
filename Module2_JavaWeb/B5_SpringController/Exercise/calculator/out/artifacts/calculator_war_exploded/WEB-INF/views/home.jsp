<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 6/6/20
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate">
    <input type="text" name="operand1" placeholder="Enter the 1st oprerand" value="0"/>
    <input type="text" name="operand2" placeholder="Enter the 2nd oprerand" value="0"/><br/>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="x">
    <input type="submit" name="operator" value="/">
</form>
</body>
</html>
