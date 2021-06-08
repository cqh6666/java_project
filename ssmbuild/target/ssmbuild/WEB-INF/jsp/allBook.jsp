<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cqh
  Date: 2021/6/3
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示页面</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 ---- 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column" style="float: right">
            <span>${msg}</span>
            <form action="${pageContext.request.contextPath}/book/queryBook" method="post" style="display: flex;justify-content: center">
                <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询书籍的名称">
                <input type="submit" class="btn btn-primary" value="查询">
            </form>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <th scope="col">书籍编号</th>
                    <th scope="col">书籍名称</th>
                    <th scope="col">书籍数量</th>
                    <th scope="col">书籍详情</th>
                    <th scope="col">操作</th>

                </thead>
                <tbody>
                    <c:forEach var="book" items="${requestScope.get('bookList')}">
                        <tr>
                            <th scope="row">${book.getBookID()}</th>
                            <td>${book.getBookName()}</td>
                            <td>${book.getBookCounts()}</td>
                            <td>${book.getDetail()}</td>
                            <td><a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.getBookID()}">更新</a> | <a href="${pageContext.request.contextPath}/book/toDeleteBook?id=${book.getBookID()}">删除</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</div>

</body>
</html>
