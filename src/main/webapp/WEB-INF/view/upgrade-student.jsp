<%@ page import="by.bsu.web.entity.Student" %>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link rel="stylesheet" href="static/css/main.css">
  <link rel="stylesheet" href="static/bootstrap/bootstrap.4.6.min.css">
  <title>Upgradestudent UI</title>
</head>
<body class="student_body">
<%
  Student student=(Student) request.getAttribute("student");
%>
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
<div style=" margin:auto; width:60%">
  <form class="parent"   action="controller?command=upgradeStudentMain" method="post">
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="inputEmail4">Name</label>
        <input type="text" class="form-control" id="inputEmail4" name="name" value="${student.name}">
      </div>
      <div class="form-group col-md-6">
        <label for="inputPassword4">Studentid</label>
        <input type="text" class="form-control" id="inputPassword4" name="studentid" value="${student.studentid}">
      </div>
    </div>

    <div class="form-row">
      <div class="form-group col-md-4">
        <label for="inputZip">major</label>
        <input type="text" class="form-control" id="inputZip" name="major" value="${student.major}" >
      </div>
      <div class="form-group col-md-4">
        <label for="inputCity">mentor</label>
        <input type="text" class="form-control" id="inputCity" name="mentor" value="${student.mentor}">
      </div>
      <div class="form-group col-md-4">
        <label for="input">gender</label>
        <input type="text" class="form-control" id="input" name="gender" value="${student.gender}" >
      </div>

      <div class="form-group col-md-6">
        <label for="inputAddress">Telephone</label>
        <input type="text" class="form-control" id="inputAddress" name="telephone" value="${student.telephone}">
      </div>

      <div style="display: none">
        <input type="text" value="${student.id}" name="id"/>
      </div>
    </div>
    <div style="text-align:center"><button type="submit" class="btn btn-primary">Upgrade Student</button></div>
  </form>
</div>
</body>
</html>

