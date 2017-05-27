<%--
  Created by IntelliJ IDEA.
  User: crf
  Date: 2017/5/26
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<shiro:guest>
    你当前是游客:
</shiro:guest>
<shiro:principal>

</shiro:principal>
 success
<a href="/shiro/logout">退出</a>
<a href="/shiro/admin">admin</a>
<a href="/shiro/user">user</a>
<a href="/shiro/test">test</a>
</body>
</html>
