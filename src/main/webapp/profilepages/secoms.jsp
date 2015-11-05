<%-- 
    Document   : secoms
    Created on : Nov 4, 2015, 1:28:36 AM
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
        <s:form action="companyAction_updatecoms">
            <s:checkboxlist label="Please select your company" list="allcomsmap" 
	   name="mycomids" value="mycomids" />
            
            <s:submit value="Submit update of comps" class="buttoninput"/>
        </s:form>
    </body>
</html>
