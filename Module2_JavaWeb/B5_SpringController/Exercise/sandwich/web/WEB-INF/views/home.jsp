<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 6/5/20
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<form action="/sandwich">
    <fieldset>
        <legend><h1>Sandwich Condiments</h1></legend>
        <input type="checkbox" name="condiment" value="Lettuce"/>Lettuce<br/>
        <input type="checkbox" name="condiment" value="Tomato"/>Tomato<br/>
        <input type="checkbox" name="condiment" value="Mustard"/>Mustard<br/>
        <input type="checkbox" name="condiment" value="Sprouts"/>Sprouts<br/>
        <button type="submit">Save</button>
    </fieldset>
</form>
</body>
</html>
