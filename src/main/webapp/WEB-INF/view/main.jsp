<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        .main_body {
            background-image: url("book.jpg");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
        .main_box{
            position: relative;
            top:200px;
            left: 200px;
        }
        .main_box .box_1{
            float:left;
            margin:50px
        }
        .main_box .box_1 .img_1{
            border:1px solid black;
            width:200px;
            height:200px;

        }
    </style>
</head>
    <body class="main_body">
    <div class="main_box">
    <div class="box_1">
        <a href="controller?command=bookList">
        <img class="img_1" src="booklist.jpg" alt="HTML tutorial" >
        </a>
        <h2 style="text-align:center;">booklist</h2>
    </div>
    <div class="box_1">
        <a href="controller?command=addBook">
        <img class="img_1" src="add.jpg" alt="HTML tutorial" >
        </a>
        <h2 style="text-align:center;">addBook</h2>
    </div>
    <div class="box_1">
        <a href="controller?command=logout">
        <img class="img_1" src="logout.jpg" alt="HTML tutorial">
        </a>
        <h2 style="text-align:center;">logout</h2>
    </div>
    </div>
    </body>
</html>