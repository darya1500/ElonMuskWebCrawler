<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result List</title>
</head>
<body>
<h3>Top 10 results</h3>
<table style="width: 85%">
    <tr>
        <th>Web page</th>
        <th>Hits</th>
    </tr>
    <c:forEach var="result" items="${RESULTS}" >
        <tr>
            <td>${result.name}</td>
            <td> ${result.allTermsHitsString}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>