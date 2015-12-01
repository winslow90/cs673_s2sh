<%-- 
    Document   : advsearch
    Created on : Nov 2, 2015, 5:41:03 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formoid-solid-blue.css" type="text/css" />
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
          <link href="stylefriend.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/style2.css" rel="stylesheet">
    <link rel="icon" href="img/logo1.png">
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="js/ie-emulation-modes-warning.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="lib/jquery-2.1.4.min.js"></script>
    <link rel="stylesheet" href="css/drop-down.css" />
    <script src="js/jquery-ui.min.js"></script>     
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link href="css/style1.css" rel="stylesheet">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
        
       <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdvSearch Page</title>
    </head>
    <body>
        
        <%@ include file="top.jsp"%>
        <section style="margin-top:90px;">
             <div class="container">

<script type="text/javascript" src="js/jquery.min.js"></script>
<form action="${pageContext.request.contextPath}/searchAction_doadvsearch.action" class="formoid-solid-blue" style="background-color:#1A2223;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:480px;min-width:150px" method="post"><div class="title"><h2>Adance Search</h2></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="fnlike"  placeholder="Search First Name like"/><!--<span class="icon-place">--></span></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="lnlike" placeholder="Search Last Name like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="sumlike" placeholder="Summary contains like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="loclike" placeholder="Location like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="unilike"  placeholder="University like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="skilike" placeholder="Skill like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="comlike"  placeholder="Company like"/></div></div>
	<div class="element-input"><div class="item-cont"><i class="fa fa-search" style="position: absolute;top:15px;left:0.9em;"></i><input class="large" type="text" name="lanlike" placeholder="language like"/></div></div>
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
<h1><strong><s:debug></s:debug></strong></h1>
             </div>  
        </section>
    </body>
    
    <script type="text/javascript" src="js/bootstrap/bootstrap-dropdown.js"></script>
<script>
     $(document).ready(function(){
        $('.dropdown-toggle').dropdown()
    });
</script>
</html>
