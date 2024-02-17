<%@ page import="java.util.List" %>
<%@ page import="org.example.thuchanhjdbc1.model.Customer" %>
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
    customers.add(new Customer("Huynh Tran Thanh Dung", "07/02/1994", "SGN","https://cdnphoto.dantri.com.vn/9rwIWM9a2xlEBsnb63k091K8vnQ=/zoom/774_516/2024/02/16/nangnongsgtrinh-nguyen-edited-1708094255887.jpeg"));
    customers.add(new Customer("Le Dang Phap", "03/05/1998", "SGN"));
    customers.add(new Customer("Nguyen Van Anh", "07/05/1994", "DAD"));

    request.setAttribute("khachhang",customers);

    out.print(customers.size());
%>

<table border="1">
    <tr>
        <td>Ten</td>
        <td>Ngay sinh</td>
        <td>Dia chi</td>
        <td>Anh</td>
    </tr>
    <c:forEach var="kh" items="${khachhang}" >
        <tr>
            <td>${kh.name}</td>
            <td>${kh.dateOfBirth}</td>
            <td>${kh.address}</td>
            <td><img src="${kh.img}"></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>