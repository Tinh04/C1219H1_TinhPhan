<%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/28/20
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <fieldset>
    <legend><h1>Calculator</h1></legend>
    <form action="/calculate" method="post">
      <label>First operand</label>
      <input type="text" name="1st_number"/><br/><br/>
      <label>Operator</label>
      <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
      </select><br/><br/>
      <label>Second operand</label>
      <input type="text" name="2nd_number"/><br/><br/>
      <input type="submit" value="Calculate"/>
    </form>
  </fieldset>
  </body>
</html>
