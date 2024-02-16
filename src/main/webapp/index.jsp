<%@ page import="java.util.List" %>
<%@ page import="org.example.thuchanhjdbc1.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Huynh Tran Thanh Dung", "07/02/1994", "SGN"));
    customers.add(new Customer("Le Dang Phap", "03/05/1998", "SGN"));

    request.setAttribute("khachhang",customers);

    out.print(customers.size());
%>

<table border="1">
    <tr>
        <td>Ten</td>
        <td>Ngay sinh</td>
        <td>Dia chi</td>
    </tr>
    <c:forEach var="kh" items="${khachhang}" >
        <tr>
            <td>${kh.name}</td>
            <td>${kh.dateOfBirth}</td>
            <td>${kh.address}</td>
        </tr>
    </c:forEach>
    <tr>
        <td><%= customers.get(0).getName()%></td>
        <td><%= customers.get(0).getDateOfBirth()%></td>
        <td><%= customers.get(0).getAddress()%></td>
    </tr>

</table>
</body>
</html>