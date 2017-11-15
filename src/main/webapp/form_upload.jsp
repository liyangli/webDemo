<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/14
  Time: 上午12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formUpload</title>
</head>
<body>


<form action="/formUpload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
