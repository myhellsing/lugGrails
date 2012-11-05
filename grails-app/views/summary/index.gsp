<%--
  Created by IntelliJ IDEA.
  User: integral
  Date: 04.11.12
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
<g:each in="${checks}" var="check">
Место покупки:  <strong>${check.location}</strong><br/>
Дата покупки: <strong>${check.date.format("dd.MM.yyyy hh:ss")}</strong><br/>
Кто платил: <strong>${check.user.username}</strong><br/>
<table>
    <thead>
    <td> <strong>Название</strong></td>
    <td> <strong>Количество</strong></td>
    <td> <strong>Цена</strong></td>
    </thead>
    <g:each in="${check.expenses}" var="expense">
         <tr>
             <td>${expense.product.toString()}</td>
             <td>${expense.quantity}</td>
             <td>${expense.price}</td>
         </tr>
    </g:each>
    <tr>
    <td colspan="2"> <strong>Итого: </strong></td>
    <td><strong>${totalCost}</strong></td>
    </tr>
</table>
<br/>
<br/>
</g:each>
</body>
</html>