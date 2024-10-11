<jsp:useBean id="result" scope="request" type="org.example.je_lab2.model.Result"/>
<%--
  Created by IntelliJ IDEA.
  User: Николай Резниченко
  Date: 07.10.2024
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sum page</title>
</head>
<body>
<p>Sum of elements bigger then: ${result.sumOfElementsBiggerThanE}</p>
<p>Common sum: ${result.sum}</p>
<p>Difference: ${result.difference}</p>
</body>
</html>
