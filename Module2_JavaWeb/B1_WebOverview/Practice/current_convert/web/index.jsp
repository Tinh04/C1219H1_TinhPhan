<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/21/20
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h1>Currency Converter</h1>
  <form action="/convert" method="get">
    <label>Rate:</label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/><br/>
    <label>USD:</label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/><br/>
    <input type="submit" id="submit" value="Converter"/>
  </form>
  </body>
</html>
