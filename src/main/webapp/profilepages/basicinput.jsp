<%-- 
    Document   : basicinput
    Created on : Nov 3, 2015, 12:30:10 AM
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
        <s:form action="profileAction_updatebasic">
            
            <s:password name="sepd" label="Password"></s:password>
            <s:password name="sepd" label="ReenterPassword"></s:password>
            <s:textfield name="sefname" label="FirstName"></s:textfield>
            <s:textfield name="selname" label="LastName"></s:textfield>
            
            <s:select list="{'Male','Female'}" headerKey="Unknown" 
                      headerValue="-" name="segender"></s:select>
            
            <s:textarea name="sesummary" cols="10" rows="4"/>
            
            <s:submit value="Confirm to Update Basic" class="buttoninput"/>
        </s:form>
    </body>
</html>
