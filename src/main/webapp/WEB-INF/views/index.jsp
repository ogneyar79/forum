<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Форум job4j</title>
</head>
<body>
<div style="position: absolute; right: 1%;"><a href="<c:url value='/logout'/>"><c:out value="${user.username}"/> |
    Выйти... </a></div>
<input type="button" value="REGISTRATION"
       onclick="window.location.href='/reg'">


<div class="container mt-3">
    <div class="row">
        <h4>Форум job4j</h4>
        <div style="position: absolute; right: 22%; font-style: italic; text-shadow: black"><a
                href="<c:url value="/create"/>">Создать новую тему</a></div>
    </div>
    <div>
        Login as : ${user.username}
    </div>
    <div class="row">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Тема</th>
                <th scope="col">Описание</th>
                <th scope="col">Дата создания</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${posts}" var="post">
                <tr>
                    <td><c:out value="${post.name}"/></td>
                    <td><c:out value="${post.description}"/></td>
                    <td><fmt:formatDate value="${post.created}" pattern="dd MMMM yyyy"/></td>
                    <td><a href="<c:url value='/editpost?id=${post.id}'/>">
                        <i class="fa fa-edit mr-3">Редактировать Пост</i>
                    </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>