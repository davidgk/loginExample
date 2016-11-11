<%--
  Created by IntelliJ IDEA.
  User: davidgk
  Date: 11/11/16
  Time: 15:38
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main" />
    <title>Lista de Negociaciones</title>
</head>


<body>

<div class="body">
    <g:each in="${negociaciones}" var="p">
        <li>${p}</li>
    </g:each>
</div>

</body>
</html>