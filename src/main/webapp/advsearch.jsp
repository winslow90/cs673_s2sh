<%-- 
    Document   : advsearch
    Created on : Nov 2, 2015, 5:41:03 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdvSearch Page</title>
    </head>
    <body>
        
        <%@ include file="top.jsp"%>
        
        <s:form action="searchAction_doadvsearch">
            
            <s:textfield name="fnlike" label="First name like"></s:textfield>
            <s:textfield name="lnlike" label="Last name like"></s:textfield>
            <s:textfield name="sumlike" label="Summary contains"></s:textfield>
            <s:textfield name="loclike" label="Location like"></s:textfield>
            <s:textfield name="unilike" label="University like"></s:textfield>
            <s:textfield name="skilike" label="Skill like"></s:textfield>
            <s:textfield name="comlike" label="Company like"></s:textfield>
            <s:textfield name="lanlike" label="Language like"></s:textfield>
           
           
            <s:submit value="Search" class="buttoninput"/>
        </s:form>
    </body>
</html>
