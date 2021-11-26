<%--
  Created by IntelliJ IDEA.
  User: HI
  Date: 11/25/2021
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="setting" method="get" action="/save">
    Language<form:select path="language" items="${language}"/><br>
    Page:<form:select path="size" items="${size}"/><br>
    Spams filter: <form:checkbox path="filter" /><br>
    Signature: <form:input path="signature" size="5"></form:input>
    <form:button>save</form:button>
</form:form>


</body>
</html>
