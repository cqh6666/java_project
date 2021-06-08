<%--
  Created by IntelliJ IDEA.
  User: cqh
  Date: 2021/6/8
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>

    <script>
      function a(){
        $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
            success:function (data){
              console.log(data);
            }
        })
      }
      $(function (){
        $("#btn").click(function (){
          $.post("${pageContext.request.contextPath}/a2",function (data){
              console.log(data)
          })

        })
      })

    </script>

  </head>
  <body>
  <h1>异步请求页面</h1>
  用户名：<input type="text" id="username" onblur="a()">

  <br>
  <input type="button" value="加载数据" id="btn">
  <table>
    <tr>
      <td>姓名</td>
      <td>年龄</td>
      <td>性别</td>
    </tr>
    <tbody>

    </tbody>
  </table>
  </body>
</html>
