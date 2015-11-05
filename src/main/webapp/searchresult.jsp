<%-- 
    Document   : result
    Created on : Nov 2, 2015, 5:41:17 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/util.js"></script>
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        <s:iterator value="resultUsers" var="con">
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
