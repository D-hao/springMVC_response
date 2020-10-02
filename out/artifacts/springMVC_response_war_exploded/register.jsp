<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2020/10/1
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% pageContext.setAttribute("ctp",request.getContextPath());%>

<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${ctp}/person" method="post">
    编号<input type="text" name="id">${errors.id}<br>
    名字<input type="text" name="name">${errors.name}<br>
    密码<input type="password" name="password">${errors.password}<br>
    生日<input type="text" name="birth">${errors.birth}<br>
    email<input type="text" name="email">${errors.email}<br>
    <input type="submit" value="登录">
</form>
</body>
</html>
