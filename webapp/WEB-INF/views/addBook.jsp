<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/7
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍页面</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>添加书籍</small>
                </h1>
            </div>
        </div>
    </div>



    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>名称：</label>
            <input type="text" class="form-control" name="name">
            </div>
        <div class="form-group">
            <label>价格：</label>
            <input type="text" class="form-control" name="price">
        </div>
        <div class="form-group">
            <label>作者：</label>
            <input type="text" class="form-control" name="author">
        </div>
        <div class="form-group">
            <label>销量：</label>
            <input type="text" class="form-control" name="sales">
        </div>
        <div class="form-group">
            <label>库存：</label>
            <input type="text" class="form-control" name="stock">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>
</div>
</body>
</html>
