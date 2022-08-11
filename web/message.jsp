<%--
  Created by IntelliJ IDEA.
  User: Tricloud
  Date: 2021/5/11
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
  <meta charset="utf-8">
  <title>论坛</title>
  <link rel="shortcut icon" href="/images/favicon.ico" />
  <link rel="stylesheet" type="text/css" href="./css/Page3.css">
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
  <div class="banner"><img src="images/message.jpg" width="940" height="310"></div>
</div>
<div class="page">
  <div class="yi">
    <h3>◎用户留言</h3>
  </div>
  <div class="yi">
    <div class="pzuo">
    <form action="addmessage" method="post">
      <div class="contain1">
        <div class="zuo1">
          <p>标题</p>
        </div>
        <div class="you1">
          <input name="title" type="text">
        </div>
      </div>
      <div class="contain2">
        <div class="zuo2">
          <p>内容</p>
        </div>
        <div class="you2">
          <textarea style="resize:none; width:500px; height:200px; background:#bcd4ee" name="content"></textarea>
        </div>
      </div>
      <div class="contain4">
        <input class="button1" type="submit" value="提交">
        <input class="button2" type="reset" value="重置">
      </div>
    </form>
      <!--<h4>出境旅游团人数多须配文明督导员</h4><p>新京报讯 （记者郭超）国家旅游局日前下发《关于进一步加强旅游行业文明旅游工作的指导意见》（以下简称《意见》），《意见》指出，各地要积极推动地方将文明旅游相关要求入法入规，推进文明旅游工作制度化。据了解，前不久，国家旅游局刚下发游客不文明行为记录暂行办法，六类不文明旅游行为可能会影响游客个人的征信以及相关活动。</p><h4>文明旅游督导员协助导游</h4><p>《意见》指出，目前，港澳台、东南亚、日韩等周边地区和国家是我国公民出境旅游的主要目的地，广东、上海、北京、广西、山东、浙江、福建、内蒙古、云南、辽宁等10个省区市出入境人员较多，这些都是文明旅游工作的重点区域。</p><h4>警惕节假日不文明行为高发</h4><p>针对近年来发生的游客冲击民航飞机等公共交通工具的不文明行为，《意见》也明确，在元旦、春节、五一、寒暑假、十一等几个时段，这些不文明行为高发，各地要落实宣传引导游客、乘客文明理性维权。发挥文明督导员、志愿服务队的作用，积极开展文明告知、文明提醒、文明规劝，引导游客文明旅游、安全旅游。</p>-->
    </div>
    <div class="pyou"><img src="images/t6.jpg" width="300" height="400"></div>
  </div>
</div>
<div class="clearit"></div>
<div class="banquan">
  <p>@论坛..最终解释权归第三组所有</p>
</div>

</body>

</html>
