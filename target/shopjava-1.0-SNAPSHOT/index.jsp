<%-- 
    Document   : index
    Created on : 08-Jan-2024, 2:00:30 am
    Author     : bsatt
--%>
<%@page import="com.happyshoppy.shopjava.MySQLConnectionCheck"%>
<%@page import="com.happyshoppy.shopjava.factoryprovider"%>
<%--<%@page import="com.happyshoppy.shopjava.factoryprovider"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HappyShoppy</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println(factoryprovider.getFactory());
//            out.println(MySQLConnectionCheck.check());
        
        %>
    </body>
</html>
