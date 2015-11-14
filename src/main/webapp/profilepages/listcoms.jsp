<%-- 
    Document   : listcoms
    Created on : Nov 4, 2015, 1:27:43 AM
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
        <s:iterator value="mycoms" var="comp">
            <li style="font-size:18px;"><strong>Company: <s:property value="#comp.cp_name"/></strong></li>
            <%--<s:property value="#comp.icon_url"/>--%>
        </s:iterator>
        
    </body>
</html>
