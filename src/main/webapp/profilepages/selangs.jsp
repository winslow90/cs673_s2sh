<%-- 
    Document   : selangs
    Created on : Nov 4, 2015, 1:28:45 AM
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
        <s:form action="languageAction_updatelangs">
            <s:checkboxlist label="Please select your languages" list="alllangsmap" 
	   name="mylangids" value="mylangids" />
            
            <s:submit value="Submit update of languages" class="buttoninput"/>
        </s:form>
    </body>
</html>
