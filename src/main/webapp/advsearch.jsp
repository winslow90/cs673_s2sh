<%-- 
    Document   : advsearch
    Created on : Nov 2, 2015, 5:41:03 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formoid-solid-blue.css" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdvSearch Page</title>
    </head>
    <body>
        
        <%@ include file="top.jsp"%>
        <section style="margin-top:90px;">
             <div class="container">

<script type="text/javascript" src="js/jquery.min.js"></script>
<form action="${pageContext.request.contextPath}/searchAction_doadvsearch.action" class="formoid-solid-blue" style="background-color:#1A2223;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:480px;min-width:150px" method="post"><div class="title"><h2>Adance Search</h2></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="fnlike" required="required" placeholder="Search First Name like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"></label><div class="item-cont"><input class="large" type="text" name="lnlike" placeholder="Search Last Name like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="sumlike" required="required" placeholder="Summary contains like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="loclike" required="required" placeholder="Location like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="unilike" required="required" placeholder="University like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="skilike" required="required" placeholder="Skill like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"><span class="required">*</span></label><div class="item-cont"><input class="large" type="text" name="comlike" required="required" placeholder="Company like"/><span class="icon-place"></span></div></div>
	<div class="element-input"><label class="title"></label><div class="item-cont"><input class="large" type="text" name="lanlike" placeholder="language like"/><span class="icon-place"></span></div></div>
<div class="submit"><input type="submit" value="Search"/></div></form><p class="frmd"><a href="http://formoid.com/v29.php">bootstrap form</a> Formoid.com 2.9</p><script type="text/javascript" src="js/formoid-solid-blue.js"></script>

<%--                 
                 
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
--%>
             </div>  
        </section>
    </body>
</html>
