<%-- 
    Document   : shoppingList
    Created on : Oct 18, 2020, 9:51:26 PM
    Author     : 834043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <br>
        Hello, ${userName} <a href="ShoppingList?logout" value="logout">Logout</a>
        <br>
        <h2>List</h2>
        <form method="post" action="">
        <span>Add item: </span><input type="text"><input type="button" name="add" value="add">
        <c:forEach items ="${list}" var="eachList">
           <p>
           <input type="radio" name="eachList" value="${eachList}">
           </p>
        </c:forEach>
        
        </form>
    </body>
</html>
