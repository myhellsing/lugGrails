<%--
  Created by IntelliJ IDEA.
  User: integral
  Date: 04.11.12
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <g:javascript library="jquery"/>
    <g:javascript src="expense.js"/>
</head>

<body>
<form action="addCheck">
    <table>
        <tr>
            <td>
                <label for="user">Кто платил?</label>
            </td>
            <td>
                <input type="text" name="user" id="user" value=""/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="date">Дата покупки</label>
            </td>
            <td>
                <input type="text" name="date" id="date" value=""/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="discount">Скидка</label>
            </td>
            <td>
                <input type="text" name="discount" id="discount" value=""/>
            </td>
        </tr>
        <g:each in="${1..20}" var="i">
            <tr id="expense_tr_${i}">
                <td>Трата</td>
                <td><input type="text" name="product" value=""/></td>
                <td><input type="text" name="price" value=""/></td>
            </tr>
        </g:each>
    </table>

    <div onclick="addExpense()">Add Expense</div><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>