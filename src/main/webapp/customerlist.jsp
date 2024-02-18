<%--
  Created by IntelliJ IDEA.
  User: tranminhloc
  Date: 17/02/2024
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>DANH SACH KHACH HANG</h1>
<table border="1px">
    <tr>
        <td>Ten</td>
        <td>Ngay sinh</td>
        <td>Dia chi</td>
        <td>Anh</td>
    </tr>
    <c:forEach var="customer" items="${kh}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.address}</td>
            <td></td>
        </tr>
    </c:forEach>

    <tr>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>
</body>
</html>
