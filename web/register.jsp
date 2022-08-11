<%--
  Created by IntelliJ IDEA.
  User: Tricloud
  Date: 2021/5/25
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <link rel="shortcut icon" href="/images/favicon.ico" />
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css">
    <link rel="stylesheet" type="text/css" href="./css/tip-yellowsimple.css">
    <script src="./js/jquery-1.8.3.min.js"></script>
    <script src="./js/jquery.poshytip.js"></script>
    <script src="./js/login.js" charset="utf-8"></script>
</head>
<body>
<div class="page">
    <div class="form">
        <form id="form" action="/BBS/Register" method="post" autocomplete="on"
              enctype="multipart/form-data">
            <h3>用户注册</h3>
            <input id="account" type="text" name="account"
                   placeholder="请输入用户名"><span> *</span>
            <input type="text" name="telephone" placeholder="请输入手机号">
            <input id="password_1" type="password" name="password_1"
                   placeholder="请输入密码"><span> *</span>
            <input id="password_2" type="password" name="password_2"
                   placeholder="请确认密码"><span> *</span>
            <div id="upload">请点击上传头像</div>
            <input type="file" id="file" name="userImg">
            <input class="submit" type="submit" value="注 册">
        </form>
    </div>
</div>
</body>
</html>
