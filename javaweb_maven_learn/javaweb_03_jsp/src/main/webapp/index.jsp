<%@ page import="com.haige.People" %>
<%@ page contentType="text/html;charset=utf-8"%>



<html>
<body>
<h2>Hello World!</h2>


<%

%>
<jsp:useBean id="people" class="com.haige.People" scope="page"/>

<jsp:setProperty name="people" property="id" value="10"/>
<jsp:setProperty name="people" property="name" value="海鸽123123"/>
<jsp:setProperty name="people" property="pwd" value="123132"/>

姓名:<jsp:getProperty name="people" property="name"/>
密码：<jsp:getProperty name="people" property="pwd"/>
</body>
</html>
