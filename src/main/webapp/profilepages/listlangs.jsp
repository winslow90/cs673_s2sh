<%-- 
    Document   : listlangs
    Created on : Nov 4, 2015, 1:27:56 AM
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
        <s:iterator value="mylangs" var="lang">
                <s:property value="#lang.lang_name"/><br/>
        </s:iterator>
        <s:debug></s:debug>
    </body>
</html>
