<%--
  Created by IntelliJ IDEA.
  User: Simon
  Date: 24/05/2018
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<html>
<head>
    <title>专业方向选择系统</title>
</head>
<body>

<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <form action="/login">
            <div class="form-group">
                <label for="stuNo">学号</label>
                <input name="stuNo" type="number" class="form-control" id="stuNo" aria-describedby="emailHelp" placeholder="请输入学号">
                <small id="emailHelp" class="form-text text-muted">你可在登陆后修改你的默认密码</small>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input name="stuPwd" type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码">
            </div>

            <button type="submit" class="btn btn-primary">学生</button>
            <button type="submit" class=" btn btn-primary">教师登陆</button>
        </form>
    </div>
</div>
</body>
</html>
