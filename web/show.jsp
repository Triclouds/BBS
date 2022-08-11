<%--
  Created by IntelliJ IDEA.
  User: Tricloud
  Date: 2021/5/10
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>留言</title>
    <link rel="stylesheet" type="text/css" href="css/show.css">
  </head>
  <body>
  <c:choose>
    <c:when test="${sessionScope.account != null}">
      <span><img src="/images/upload/${sessionScope.image}" alt="head">&nbsp;<strong>${sessionScope.account}</strong> ${sessionScope.telephone} | <a href="/BBS/index.jsp">退出</a></span>
    </c:when>
    <c:otherwise>
      <span><a href="/BBS/login.jsp">请登录</a></span>
    </c:otherwise>
  </c:choose>
<a href="/BBS/show">首页</a>
<a href="/BBS/showme">我的留言</a>
<a href="/BBS/message.jsp">添加留言</a>
<br><hr>
  <h2>留 言</h2>
<%--  <img src="<c:url value="/img/you.jpg"/>" alt="图片">--%>
<c:forEach items="${list}" var="message">
  <ul>
    <li>
        ${message.messageTitle}
        ${message.messageAuthor}<br>
        ${message.messageContent}
        ${message.messageTime}
    </li>
  </ul>
</c:forEach>
  </body>
</html>
