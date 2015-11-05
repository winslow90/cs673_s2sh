<%-- 
    Document   : listsks
    Created on : Nov 4, 2015, 1:27:27 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:iterator value="mysks" var="sk">
                <s:property value="#sk.sk_name"/><br/>
                <br/>
        </s:iterator>
        <s:debug></s:debug>
    </body>
</html>
