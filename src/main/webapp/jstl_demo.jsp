<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/14
  Time: 下午11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="demo" uri="http://www.demo.com" %>
<html>
<head>
    <title>jstl Demo</title>
</head>
<body>

<c:out value="liyangli"/>
<c:set scope="session" value="true" var="flag"/>
<c:out value="${flag}"/>
<c:if test="${flag == true}">
    Hello liyangli i first
</c:if>
<br/>
<!--forEach-->
<%
   String[] items = {"dog","cat","mouse"};
   pageContext.setAttribute("items",items);
%>
<c:forEach var="item" items="${items}">
    <c:out value="item-->${item}"/>
</c:forEach>
<br/>
<demo:hello name="demo" age="30">HELLO LYL</demo:hello>
</body>
</html>
