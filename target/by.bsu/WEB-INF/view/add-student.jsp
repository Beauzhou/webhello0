<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="static/css/main.css">
    <link rel="stylesheet" href="static/bootstrap/bootstrap.4.6.min.css">
    <title>ADDstudent UI</title>
</head>
    <body class="student_body">
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
    <div style=" margin:auto; width:60%">
        <form class="parent"   action="controller?command=addStudentCommand" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Name</label>
                    <input type="name" class="form-control" id="inputEmail4" name="name">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Studentid</label>
                    <input type="text" class="form-control" id="inputPassword4" name="studentid">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputZip">major</label>
                    <input type="text" class="form-control" id="inputZip" name="major">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputCity">mentor</label>
                    <input type="text" class="form-control" id="inputCity" name="mentor">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputState">gender</label>
                    <select id="inputState" class="form-control" name="gender">
                        <option>boy</option>
                        <option>girl</option>
                    </select>
                </div>
                <div class="form-group col-md-6">
                    <label for="inputAddress">Telephone</label>
                    <input type="text" class="form-control" id="inputAddress" name="telephone">
                </div>
            </div>
            <div  style="text-align: center;width:200px"><button type="submit" class="btn btn-primary">Add</button></div>
        </form>
    </div>
    </body>
</html>
