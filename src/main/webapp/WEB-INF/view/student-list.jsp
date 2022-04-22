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
        <table class="table table-hover" style="width:80%">
            <thead>
            <tr>
                <th scope="col">name</th>
                <th scope="col">studentid</th>
                <th scope="col">major</th>
                <th scope="col">mentor</th>
                <th scope="col">gender</th>
                <th scope="col">telephone</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <th scope="row">${student.name}</th>
                    <td>${student.studentid}</td>
                    <td>${student.major}</td>
                    <td>${student.mentor}</td>
                    <td>${student.gender}</td>
                    <td>${student.telephone}</td>
                    <td><c:if test="${user != null and user.is_admin == 1}"><a href="controller?command=upgradeStudents&id=${student.id}"><button type="button" class="btn btn-success">Upgrade</button></a></c:if></td>
                    <td><c:if test="${user != null and user.is_admin == 1}"><a href="controller?command=deleteStudent&id=${student.id}"><button type="button" class="btn btn-danger">Delete</button></a></c:if></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </body>
</html>