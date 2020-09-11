<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/21/20
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1>Vietnamese Dictionary</h1>
  <form action="/translate" method="post">
    <input type="text" name="keyword" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
  </form>
  </body>
</html>
