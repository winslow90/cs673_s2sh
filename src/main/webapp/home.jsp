<%-- 
    Document   : home.jsp
    Created on : Nov 2, 2015, 3:37:00 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> ${me.fname} ${me.lname}
            Home Page</title>
    </head>
    <body>
        
        <%@ include file="top.jsp"%>
        
        <hr/>
        
        <h1>this is the home page</h1>
        
        
        <hr/>
        <h3>this is recommendation</h3>
        <s:iterator value="recommendation" var="con">
             <div id="userdiv${con.uid}">
                <img src="${con.photo_url}" height="50" width="50"/>
                <s:property value="#con.fname"/>&nbsp
                <s:property value="#con.lname"/>&nbsp&nbsp&nbsp
                <s:property value="#con.gender"/>&nbsp
                <br/>
                <s:property value="#con.summary"/>&nbsp
                <br/>
                <s:property value="#con.location"/>&nbsp
                <br/>
                <s:property value="#con.photo_url"/>&nbsp
                <br/>
                <br/>
                
                <s:form action="otherprofileAction_viewotherprofile">
                    <s:hidden name="hisuid" value="%{#con.uid}"></s:hidden>
                    <s:submit value="view me" class="buttoninput"/>
                </s:form>
                
            </div>
        </s:iterator>
        
        <hr/>
        
        <s:iterator value="updates" var="up">
            <s:property value="#up.up_content"/>
            <s:property value="#up.up_datetime"/>
            
            <s:form action="otherprofileAction_viewotherprofile">
                <s:hidden name="hisuid" value="%{#up.relating_uid}"></s:hidden>
                <s:submit value="view me" class="buttoninput"/>
            </s:form>
            <br/>
        </s:iterator>
        
        <s:debug></s:debug>
    </body>
</html>
