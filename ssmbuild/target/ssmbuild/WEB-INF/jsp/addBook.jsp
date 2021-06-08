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
                    <small>书籍列表 ---- 新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="get">
        <div class="mb-3">
            <label for="bookName" class="form-label">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookName" aria-describedby="bookHelp" required>
            <div id="bookHelp" class="form-text">请输入完整的书名</div>
        </div>
        <div class="mb-3">
            <label for="bookCount" class="form-label">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCount" required>
        </div>
        <div class="mb-3">
            <label for="detail" class="form-label">描述</label>
            <input type="text" name="detail" class="form-control" id="detail" required>
        </div>
        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="bookCheck">
            <label class="form-check-label" for="bookCheck">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary">提交</button>
    </form>


</div>

</body>
</html>
