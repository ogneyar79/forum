<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.05.2021
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div class="container mt-3">
    <div class="row">
        <h4>Форум job4j</h4>
    </div>
    <div class="row">
        <table class="table">
            <thead>
            <tr>
                <div><input type="button" value="REGISTRATION"
                            onclick="window.location.href='/reg'"></div>
            </tr>
            <tr>
                <div style="width: 10%">Авторизация</div>
            </tr>
            </thead>
            <tbody>
            <form name='login' action="<c:url value='/login'/>" method='POST'>
                <tr>
                    <td>UserName:</td>
                    <td><input type='text' name='username'></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password'/></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="submit"/></td>
                </tr>

            </form>
            <tr>
                <td style="color: brown">
                    <c:out value="${errorMessage}"/>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>