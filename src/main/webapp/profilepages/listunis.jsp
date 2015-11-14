<%-- 
    Document   : listunis
    Created on : Nov 3, 2015, 7:13:10 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uni list Page</title>
    </head>
    <body>
        <s:iterator value="myunis" var="uni">
            <li style="font-size:18px;"><strong>School:<s:property value="#uni.uni_name"/> </strong></li>
                <%--<s:property value="#uni.icon_url"/><br/>--%>
        </s:iterator>
        <s:debug></s:debug>
    </body>
</html>
