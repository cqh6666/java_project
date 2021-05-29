<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>当前有  <span><%=this.getServletConfig().getServletContext().getAttribute("onlineCount")%></span> 人在线</h1>
<h1>主页</h1>
</body>
</html>
