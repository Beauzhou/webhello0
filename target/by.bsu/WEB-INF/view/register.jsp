<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="static/css/style.css">
    <link rel="icon" type="image/x-icon" href="static/img/favicon.ico">
    <title>REGISTER UI</title>
</head>
<body>
<div class="box" >
    <div style="text-align: center;margin: 0 auto;">
        <h2>USER REGISTER</h2>
    </div>
    <div class="rg_center">
        <div class="rg_form">
            <form action="controller?command=registerCommand" method="post">
                <table>
                    <tr><!--label 标签的作用是当点击文字也会跳到文本输出框-->
                        <!--for属性与ID属性对应规定 label 绑定到哪个表单元素。-->
                        <td style="color: white"><label for="username">name</label> </td>
                        <td class="td_right"><input type="text" name="name" id="username"> </td>
                    </tr>
                    <tr>
                        <td style="color: white"><label for="login">login</label> </td>
                        <td class="td_right"><input type="text" name="login" id="login"> </td>
                    </tr>
                    <tr>
                        <td style="color: white"><label for="password">password</label> </td>
                        <td class="td_right"><input type="password" name="password" id="password"> </td>
                    </tr>
                    <tr>
                        <td colspan="2"  style="text-align: center">
                            <input type="submit" value="register" id="btn_sub">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <div class="rg_right">
        <p style="color: white">Have account?<a href="index.jsp">Login</a></p>
    </div>
</div>
</body>
</html>
