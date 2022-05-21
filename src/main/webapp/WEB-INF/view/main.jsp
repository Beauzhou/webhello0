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
                    <li class="nav-item ">
                        <a class="nav-link" href="controller?command=selectMark" >mark</a>
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
    <div class="jumbotron" style="margin: 50px 100px;background-color:rgba(225,228,196,0.5);">
        <h1 class="display-4">Hello, Student!</h1>
        <p class="lead">This is a student information management system where you can search student information by name, major, and also view tutor information.</p>
        <hr class="my-4">
        <p>If you have any questions, please contact the administrator.</p>
        <a class="btn btn-primary btn-lg" href="controller?command=studentList" role="button">Start Inquiry</a>
    </div>
    </body>
</html>