<%@ page import="java.lang.annotation.Target" %>
<%@ page import="org.apache.shiro.SecurityUtils" %><%--
  Created by IntelliJ IDEA.
  User: crf
  Date: 2017/5/25
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
   <meta charset="UTF-8">
  <head>
    <title>$Title$</title>
  </head>
  <body>

<shiro:guest>
  你当前是游客:
</shiro:guest>

  <form method="post" action="/shiro/login">
    <label for="username"> 用户名:</label>
    <input type="text" name="username" id="username">
    <br/>
    <label for="password"> 密码:</label>
    <input type="text" name="password" id="password">
    <br/>
    <input type="submit" value="提交">

  </form>
  </body>
</html>
