<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="static/css/main.css">
    <link rel="stylesheet" href="static/bootstrap/bootstrap.4.6.min.css">
    <title>MAIN UI</title>
</head>
    <body class="main_body">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">Student Information </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item ">
                        <a class="nav-link" href="controller?command=main" >main </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controller?command=studentList" >studetlists</a>
                    </li>
                    <li class="nav-item">
                        <c:if test="${user != null and user.is_admin == 1}">
                        <a class="nav-link" href="controller?command=addStudent">add student</a>
                        </c:if>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="controller?command=mentorList" >Mentorlists</a>
                    </li>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="controller?command=logout">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="main_box">
    <div class="box_1">
        <a href="controller?command=studentList">
        <img class="img_1" src="static/img/booklist.jpg" alt="HTML tutorial" >
        </a>
        <h2 style="text-align:center;">studentlist</h2>
    </div>
    <c:if test="${user != null and user.is_admin == 1}">
    <div class="box_1">
        <a href="controller?command=addStudent">
        <img class="img_1" src="static/img/add.jpg" alt="HTML tutorial" >
        </a>
        <h2 style="text-align:center;">addStudent</h2>
    </div>
    </c:if>
    <div class="box_1">
        <a href="controller?command=logout">
        <img class="img_1" src="static/img/logout.jpg" alt="HTML tutorial">
        </a>
        <h2 style="text-align:center;">logout</h2>
    </div>
    </div>
    </body>
</html>