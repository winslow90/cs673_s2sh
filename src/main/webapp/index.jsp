<%-- 
    Document   : index
    Created on : Oct 27, 2015, 7:18:31 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LinkedIn</title>
        <s:head/>
    </head>
    <body>
        
        <h1>Welcome Linkedin</h1>
        <s:actionerror/>
        <hr/>
        
        <s:form action="userAction_login">
            <s:textfield name="logemail" label="Email"></s:textfield>
            <s:password name="logpd" label="Password"></s:password>
           
            <s:submit value="Login" class="buttoninput"/>
        </s:form>
        <hr/>
        <s:form action="userAction_register">
            <s:textfield name="email" label="Email"></s:textfield>
            <s:password name="pd" label="Password"></s:password>
            <s:password name="pd" label="ReenterPassword"></s:password>
            <s:textfield name="fname" label="FirstName"></s:textfield>
            <s:textfield name="lname" label="LastName"></s:textfield>
            
            <s:select list="{'Male','Female'}" headerKey="Unknown" headerValue="-" name="gender"></s:select>
            
            <s:submit value="Register" class="buttoninput"/>
        </s:form>
        <hr />
        
        <s:debug></s:debug>
    </body>
</html>