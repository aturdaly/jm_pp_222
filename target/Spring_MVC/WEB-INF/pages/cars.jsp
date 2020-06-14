<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<table>
    <c:set var="locale" value="${param.get('locale')}" />
    <caption>${locale == "ru" ? "МАШИНЫ" : "CARS"}</caption>
    <tr>
        <th>Price</th>
        <th>Name</th>
        <th>Series</th>
    </tr>
    <c:forEach var="car" items="${carList}">
    <tr>
        <td>${car.price}</td>
        <td>${car.name}</td>
        <td>${car.series}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
