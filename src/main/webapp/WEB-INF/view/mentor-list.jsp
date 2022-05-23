<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="static/css/mentor.css">
    <link rel="stylesheet" href="static/bootstrap/bootstrap.4.6.min.css">
    <link rel="icon" type="image/x-icon" href="static/img/favicon.ico">
    <title>MentorsList UI</title>
</head>
<body class="list_body1">
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
<%--<h2 class="h2">Mentor list </h2>--%>
<div class="list_div1" >
    <c:forEach items="${mentors}" var="mentor">
    <div class="card" style="width: 18rem;">
        <img src="static/img/mentor1.png" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">${mentor.name}</h5>
            <p class="card-text">${mentor.profession}</p>
            <a href="#" class="btn btn-primary">${mentor.description}</a>
        </div>
    </div>
    </c:forEach>

    <div class="mentor2"><img src="static/img/mentor2.png" alt=""></div>
    <div class="mentor3"><img src="static/img/mentor3.png" alt=""></div>
    <div class="mentor4"><img src="static/img/mentor4.png" alt=""></div>
</div>
</body>
</html>