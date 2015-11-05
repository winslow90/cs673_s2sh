<%-- 
    Document   : sesks
    Created on : Nov 4, 2015, 1:29:04 AM
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
        <s:form action="skillAction_updatesks">
            <s:checkboxlist label="Please select your skill" list="allsksmap" 
	   name="myskids" value="myskids" />
            
            <s:submit value="Submit update of skills" class="buttoninput"/>
        </s:form>
    </body>
</html>
