<%-- 
    Document   : connections
    Created on : Nov 2, 2015, 5:40:14 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connection Page</title>
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        <hr/>
        
        <h1>this is the connection page</h1>
        
        <s:iterator value="connections" var="con">
            <s:property value="#con.fname"/>&nbsp
            <s:property value="#con.lname"/>&nbsp&nbsp&nbsp
            <s:property value="#con.gender"/>&nbsp
            <br/>
            <s:property value="#con.summary"/>&nbsp
            <br/>
            <s:property value="#con.location"/>&nbsp
            <br/>
            <s:property value="#con.photo_url"/>&nbsp
            <br/>
            <br/>
        </s:iterator>
        
        <s:debug></s:debug>
    </body>
</html>
