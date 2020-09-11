<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: tinhph
  Date: 5/27/20
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%! Map<String, String> dictionary = new HashMap<>();
%>

<%
    dictionary.put("name", "ten");
    dictionary.put("age", "tuoi");

    String search = request.getParameter("word");

    String result = dictionary.get(search);
    if (result != null) {
        out.println("word: " + search);
        out.println("result: " + result);
    } else {
        out.println("not found");
    }
%>
</body>
</html>
