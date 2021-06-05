<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Car Accidents</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div style="text-align: center">
    <a href="<c:url value='/create'/>">Добавить инцидент</a><br>

</div>
<div class="container">
    <h2>Black/Dark Table</h2>
    <p>The .table-dark class adds a black background to the table:</p>
    <div>
        Login as : ${user.username}
    </div>
    <table class="table table-dark">
        <thead>
        <tr>
            <th> ID</th>
            <th> USERNAME</th>
            <th> EMAIL</th>
            <th> PASSWORD</th>
            <th></th>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td> ${item.id}</td>
                <td> ${item.username}</td>
                <td> ${item.email}</td>
                <td> ${item.password}</td>
                <td><a href="<c:url value='/edit?id=${item.id}'/>">Редактировать User</a></td>
            </tr>
        </c:forEach>
        </thead>
        <tbody id="table"></tbody>
    </table>
</div>
</body>
</html>