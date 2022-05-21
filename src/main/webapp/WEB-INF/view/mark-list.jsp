<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="static/css/main.css">
    <link rel="stylesheet" href="static/bootstrap/bootstrap.4.6.min.css">
    <title>StudentsList UI</title>
</head>
<body class="list_body">
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

<div class="list_div" >
    <h2 class="h2">Student list </h2>
    <div class="select" style="margin: 10px 300px;">
        <form class="form-inline" action="controller?command=selectMark" method="post">
            <div class="form-group mb-2">
                <label for="staticEmail2" class="sr-only">Name</label>
                <input type="text" class="form-control" id="staticEmail2" placeholder="name" name="name" >
            </div>
            <div class="form-group mx-sm-3 mb-2">
                <label for="inputPassword2" class="sr-only">StudentId</label>
                <input type="text" class="form-control" id="inputPassword2" placeholder="studentid"  name="studentid">
            </div>
            <button type="submit" class="btn btn-primary mb-2">search</button>
        </form>
    </div>
    <table class="table table-hover" style="width:80%">
        <thead>
        <tr>
            <th scope="col">name</th>
            <th scope="col">studentid</th>
            <th scope="col">java</th>
            <th scope="col">aws</th>
            <th scope="col">decisiontrees</th>
            <th scope="col">english</th>
            <th scope="col">computervision</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${marks}" var="mark">
            <tr>
                <th scope="row">${mark.name}</th>
                <td>${mark.studentid}</td>
                <td>${mark.java}</td>
                <td>${mark.aws}</td>
                <td>${mark.decisiontrees}</td>
                <td>${mark.english}</td>
                <td>${mark.computervision}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>