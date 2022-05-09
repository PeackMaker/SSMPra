<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/7
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表========展示所有书本</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <%--/book/addBook--%>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toaddBook">添加书籍</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/showAll">显示所有书籍</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="row">
            <div class="col-md-4 column">
                <form action="${pageContext.request.contextPath}/book/queryBook" method="post" class="form-inline">
                    <span style="color:red;font-weight: bold ">${err}</span>
                    <input type="text" name="bookName" class="form-control" placeholder="请输入要查询的书籍名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class=" table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>名称</th>
                    <th>价格</th>
                    <th>作者</th>
                    <th>销量</th>
                    <th>库存</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${books}">
                    <tr>
                        <td>${book.id}</td>
                        <td>${book.name}</td>
                        <td>${book.price}</td>
                        <td>${book.author}</td>
                        <td>${book.sales}</td>
                        <td>${book.stock}</td>
                        <th>
                            <a href="${pageContext.request.contextPath}/book/toUpdateBook?name=${book.name}"
                               methods="post">修改</a> &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${book.name}"
                               methods="post">删除</a>
                        </th>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
