<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" href="static/css/style.css">
    <title>login UI</title>
    </head>
    <body>
        <div class="box">
            <h2>login</h2>
            <form action="controller?command=login" method="post">
            <div class="inputBox">
                <input type="text" name="login" required="">
                <label>ID</label>
            </div>
            <div class="inputBox">
		        <input type="password" name="password" required="">
		        <label>PASSWORD</label>
            </div>
            <div style="text-align: center;">
            <input class="submit1" type="submit" name="" value="submit">
            </div>
	        </form>
            <div style="text-align: center; ">
            <form action="controller?command=register" method="post" >
            <input  style="text-align: center" class="submit2" type="submit" name="register" value="register">
            </form>
            </div>
	    </div>
	    <script type="text/javascript">
	    <c:if test="${error_message !=null}">
                   alert("${error_message}")
        </c:if>
        </script>
    </body>
</html>
