<%--
  Created by IntelliJ IDEA.
  User: susu
  Date: 14/12/2021
  Time: 9:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="a" items="${condiment}">
    ${a}
</c:forEach>
</body>
</html>