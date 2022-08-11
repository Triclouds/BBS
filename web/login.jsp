<%--
  Created by IntelliJ IDEA.
  User: Tricloud
  Date: 2021/5/25
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta charset="utf-8">
      <title>用户登录</title>
      <link rel="shortcut icon" href="/images/favicon.ico" />
      <link rel="stylesheet" type="text/css" href="css/style.css">
      <link rel="stylesheet" type="text/css" href="css/login.css">
  </head>
  <body>
  <div class="page">
    <div class="form">
      <form id="form" action="/BBS/Login" method="post" autocomplete="on">
        <h3>用户登录</h3>
        <input type="text" name="account" required placeholder="用户名">
        <input type="password" name="password" required placeholder="密码">
        <input class="submit" type="submit" value="登 录">
          <a href="register.jsp">去注册>></a>
      </form>
    </div>
  </div>
  </body>
</html>
