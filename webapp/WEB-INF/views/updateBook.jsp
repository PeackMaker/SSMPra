<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/7
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍页面</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>



    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
      <input type="hidden" name="id" value="${getBook.id}">
        <div class="form-group">
            <label>名称：</label>
            <input type="text" class="form-control" name="name"  value="${getBook.name}" required>
        </div>
        <div class="form-group">
            <label>价格：</label>
            <input type="text" class="form-control" name="price" value="${getBook.price}" required >
        </div>
        <div class="form-group">
            <label>作者：</label>
            <input type="text" class="form-control" name="author" value="${getBook.author}" required>
        </div>
        <div class="form-group">
            <label>销量：</label>
            <input type="text" class="form-control" name="sales"  value="${getBook.sales}" required>
        </div>
        <div class="form-group">
            <label>库存：</label>
            <input type="text" class="form-control" name="stock"  value="${getBook.stock}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
