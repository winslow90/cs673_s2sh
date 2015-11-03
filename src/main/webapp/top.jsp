<%-- 
    Document   : top.jsp
    Created on : Nov 2, 2015, 3:36:48 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>top Page</title>
    </head>
    <body>
        
        <h1>This is ${me.fname} ${me.lname}
            's home page from top page</h1>
            
            <div style="float:right">   
                <s:iterator value="notification" var="ntf">
                    <s:property value="#ntf.nt_content"/>&nbsp&nbsp&nbsp&nbsp
                    <s:property value="#ntf.nt_datetime"/><br/>
                </s:iterator>
            </div>
        
        
        <s:form action="#">
            <s:textfield name="searchstr" label="Search"></s:textfield>                       
            <s:submit value="SimpleSearch" class="buttoninput"/>
        </s:form>
            
            
        
        <s:url value="updateAction_viewhome" var="home"/>
        <strong><s:a href="%{home}">Home</s:a></strong>
        <br/>
        
        
        <br/>
        
        <s:url value="connectionAction_viewconnection" var="viewconnection"/>
        <s:url value="connectionAction_filladvsearch" var="advsearch"/>
        <strong>Connections  </strong>
        <s:a href="%{viewconnection}">viewconnections</s:a>
        <s:a href="%{advsearch}">advancedsearch</s:a>
        <br/>
        
        
        
        <s:url value="userAction_logout" var="logout"/>
        <strong><s:a href="%{logout}">Logout</s:a></strong>        
        <br/>
        
        
        <s:debug></s:debug>
        
        
    </body>
</html>
