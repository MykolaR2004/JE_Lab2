<jsp:useBean id="result" scope="request" type="org.example.je_lab2.model.Result"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabulation page</title>
</head>
<body>
<div class="container">
    <%
        double[] arrX = result.getXArr();
        double[] arrY = result.getYArr();
    %>
    <table class="table">
        <thead>
        <tr><th>Index</th><th>X</th><th>Y</th></tr>
        </thead>
        <tbody>
        <%
            for (int i = 0; i < arrX.length; i++) {
        %>
        <tr>
            <td><%= i %></td>
            <td><%= arrX[i] %></td>
            <td><%= arrY[i] %></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
