<%-- 
    Document   : seunis
    Created on : Nov 3, 2015, 7:26:45 PM
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
        this is the university selecting page
        <s:form action="universityAction_updateunis">
            <s:checkboxlist label="Please select your university" list="allunismap" 
	   name="myuniids" value="myuniids" />
            
            <s:submit value="Submit update of unies" class="buttoninput"/>
        </s:form>
        
    </body>
</html>
