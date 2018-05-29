<%--
  Created by IntelliJ IDEA.
  User: Simon
  Date: 24/05/2018
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="http" uri="http://www.springframework.org/tags/form" %>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<html>
<head>
    <title>方向选择</title>
</head>
<body>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">学号</th>
        <th scope="col">姓名</th>
        <th scope="col">班级</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${studentinfo}">
        <tr>
            <td>${c.stu_no}</td>
            <td>${c.stu_name}</td>
            <td>${c.stu_class}</td>
           <td><form action="/volunteer/${c.stu_no}">
               
               <c:if test="${c.stu_class_no.equals('0')}">
                   <select name="course" class="form-control form-control-sm">
                       <option>Unity游戏开发</option>
                   </select>
               </c:if>

               <button class="btn-primary" type="submit">提交</button>
           </form></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a href="/fun"><button>修改密码</button></a>
</body>
</html>
