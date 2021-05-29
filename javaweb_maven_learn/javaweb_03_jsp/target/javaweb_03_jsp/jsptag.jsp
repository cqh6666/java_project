<%--
  Created by IntelliJ IDEA.
  User: cqh
  Date: 2021/5/29
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>jsptag</h1>
<jsp:forward page="/index.jsp">
    <jsp:param name="username" value="root"/>
    <jsp:param name="password" value="123123"/>
</jsp:forward>
<h1>jsptag</h1>
</body>
</html>
