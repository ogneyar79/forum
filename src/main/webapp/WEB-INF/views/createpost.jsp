<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            background: #F5E9D9;
        }

        .accident {
            max-width: 350px;
            margin: 50px auto 0;
            padding: 20px;
            background: #fffdee;
            border: 10px solid transparent;
            border-image: 10 repeating-linear-gradient(135deg, #C42061, #C42061 10px, transparent 10px, transparent 20px, #FBCFDF 20px, #FBCFDF 30px, transparent 30px, transparent 40px);
            font-family: 'Playfair Display';
            color: #605756;
        }

        .form-row {
            margin-bottom: 15px;
        }

        .form-row input[type="text"], .form-row textarea {
            width: 100%;
            padding: 0 10px;
            line-height: 35px;
            border-width: 0;
            outline: none;
            background: transparent url(https://html5book.ru/wp-content/uploads/2016/12/bg-form.png) bottom left repeat-x;
            background-size: 8px 35px;
            font-family: 'Playfair Display';
        }

        .form-row textarea {
            background-attachment: local;
            background-repeat: repeat;
            resize: none;
        }

        .form-row input[type="submit"] {
            padding: 10px 20px;
            margin-top: 10px;
            background: #F67CA5;
            border-width: 0;
            cursor: pointer;
            outline: none;
            font-family: 'Playfair Display';
            font-size: 13px;
            letter-spacing: 1px;
            color: #fffdee;
            text-transform: uppercase;
            transition: 1s cubic-bezier(.165, .84, .44, 1);
        }

        .form-row input[type=submit]:hover {
            background: #C42061;
        }
    </style>
</head>
<body>
<h1> CREATE POST</h1>
<form action="<c:url value='/sss'/>" method='post' class="sss">
    <div class="form-row">
        <label for="name">Post name</label><input type="text" name="name"
                                                  placeholder="Введите название поста"
                                                  id="name">
    </div>
    <div class="form-row">
        <label for="desc">Post description</label>
        <textarea rows="5" name="location" placeholder="Введите описание"
                  id="desc" required></textarea>
    </div>
    <div class="form-row">
        <input name="submit" type="submit" value="Сохранить"/>
    </div>
</form>
</body>
</html>