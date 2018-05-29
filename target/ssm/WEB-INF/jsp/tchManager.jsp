<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Simon
  Date: 28/05/2018
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">学号</th>
        <th scope="col">姓名</th>
        <th scope="col">班级</th>
        <th scope="col">方向</th>
        <th scope="col">选择结果</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${studentvolunteer}">
        <tr>
            <td>${c.stu_no}</td>
            <td>${c.stu_name}</td>
            <td>${c.stu_class}</td>
            <td>${c.stu_volunteer}</td>
            <td>${c.selection_result}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a href="/toexcel"><button>导出</button></a>
</body>
</html>
