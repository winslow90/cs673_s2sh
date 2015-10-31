<%-- 
    Document   : test.jsp
    Created on : Oct 30, 2015, 11:23:49 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:checkboxlist name="foo" list="{'Popeye', 'He-Man', 'Spiderman'}"/>
    </body>
</html>
