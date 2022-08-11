<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta charset="utf-8">
	<title>论坛</title>
	<link rel="shortcut icon" href="/images/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<style>
		span {
			float: right;
			margin-top: 50px;
			line-height: 30px;
		}
		span img {
			width: 30px;
			height: 30px;
		}

		span a:hover {
			color: #89c1f9;
		}

		.time {
			float: right;
		}
	</style>
</head>

<body>
<div class="page">
	<div class="logo"><img src="images/logo.jpg" width="400" height="100"></div>
	<c:choose>
		<c:when test="${sessionScope.account != null}">
			<span><img src="/images/upload/${sessionScope.image}" alt="head">&nbsp;<strong>${sessionScope.account}</strong> | <a href="/BBS/login.jsp">退出</a></span>
		</c:when>
		<c:otherwise>
			<div class="zuo">
				<p><a href="register.jsp">注册</a></p>
			</div>
			<div class="you">
				<p><a href="login.jsp">登录</a></p>
			</div>
		</c:otherwise>
	</c:choose>
</div>

<div class="clearit"></div>

<div class="daohang">
	<ul>
		<li><a href="index.jsp">首页</a></li>
		<li><a href="/BBS/showme">我的留言</a></li>
		<li><a href="message.jsp">添加留言</a></li>
		<li><a href="/BBS/show">所有留言</a></li>
		<!--<li><a href="Page5.html">管理员登录</a></li>-->
		<!--<li><a href="Page6.html">管理员管理</a></li>-->
		<li><a href="contact.jsp">联系我们</a></li>
	</ul>
</div>
<div class="page">
	<div class="banner"><img src="images/look.jpg" width="940" height="310"></div>
</div>
<div class="page">
	<div class="yi">
		<h3>◎用户查看</h3>
	</div>
	<c:forEach items="${myList}" var="message">
		<div class="er">
			<p>
				<strong>${message.messageTitle}</strong><br>
					${message.messageContent}
					${message.messageTime}
			</p>
		</div>
	</c:forEach>
</div>

<div class="banquan">
	<p>@论坛..最终解释权归第三组所有</p>
</div>

</body>

</html>