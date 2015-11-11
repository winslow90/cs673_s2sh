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
   
    
    <head>
    <title>Welcome!|Linkedin</title>
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
</head>

    
    
    
    
    
    
    
    <body>
        
           <nav class="navbar navbar-inverse navbar-fixed-top" style="background-color:rgb(90,90,90);">
        <div class="container">
            <div class="row">
               <div class="col-md-2">    
                 <a href="#"><img src="img/logo1.png"></a>
               </div>
                <div class="col-md-6">
               
                
             <form action="${pageContext.request.contextPath}/searchAction_dosimplesearch.action" method="post" class="navbar-form">
                 


		
                 

           
                 

                <div class="form-group">
                 
                    <input name="simplestr" type="text" placeholder="Search for people, jobs, companies, and more..." class="form-control">
                 </div>     
                <button type="submit" class="btn btn-primary">
                    <span class="glyphicon glyphicon-search" aria-hidden="true" ></span>
                </button>
                 
                <s:url value="searchAction_viewadvsearch" var="advsearch"/>
                 <!--<a href="#" >Advanced</a>-->
                <s:a href="%{advsearch}">advancedsearch</s:a>
                 
             </form>
                    
                </div>
                
             <!--NOtification--->
                    <div class="col-xs-1" style="margin-right:1px;">
                    <div class="btn-group">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color:rgb(90,90,90);font-size:20px;">
   <span class="glyphicon glyphicon-flag" aria-hidden="true"style="color:rgb(153,153,153);"></span> 
  </button>
                        <ul class="dropdown-menu"><div style="background-color:black"><font style="color:#fff">Notification</font></div>
        <li><a href="#" style="color:#fff"> <img class="media-object" src="img/user.png" style="width:20px; height:20px">&nbsp;jack send friend request</a></li>
        <li><a href="#" style="color:#fff"> <img class="media-object" src="img/user.png" style="width:20px; height:20px">&nbsp;jack send friend request</a></li>
        <li><a href="#" style="color:#fff"> <img class="media-object" src="img/user.png" style="width:20px; height:20px">&nbsp;jack send friend request</a>></li>
        
     </ul>
   
</div>
                </div>
                    <div class="col-xs-1" >
                    <div class="btn-group">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color:rgb(90,90,90);font-size:20px;">
   <span class="glyphicon glyphicon-user" aria-hidden="true"style="color:rgb(153,153,153);"></span> 
  </button>
    <ul class="dropdown-menu"><div style="background-color:black"><font style="color:#fff">Account & setting</font></div>
        <li><a href="#" style="color:#fff">&nbsp;<span class="glyphicon glyphicon glyphicon-cog">&nbsp;Account</span></a></li>
        <li><a href="#" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-user"></span>&nbsp;People</a></li>
        <s:url value="userAction_logout" var="logout"/>
        <li><s:a href="%{logout}" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;&nbsp;logout</s:a></li>
        
        
        
     </ul>
   
</div>
                   
                    
                </div>
                
                
            </div>
            
        </div>
        <div class="row" style="background-color:black;">
            <div class="btn-group" style="margin-left:20px;">
  
      <!--<a href="main.html" >Home</a>-->
      <s:url value="updateAction_viewhome" var="home"/>
      <s:a href="%{home}">Home</s:a>
  
    
   
</div>
             <div class="btn-group" style="margin-left:20px;">
<!--  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color:black"> -->
      
<!--      <a href="#">Profile</a>-->
      <s:url value="profileAction_viewprofile" var="profile"/>
      <s:a href="%{profile}">Profile</s:a>
      
      
  <!--</button>-->
   <!-- <ul class="dropdown-menu">
        <li><a href="edit.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-pencil">&nbsp;Edit</span></a></li>
        <li><a href="viewprofile.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-user"></span>&nbsp;View</a></li>
        <li><a href="create.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-plus"></span>&nbsp;Create</a></li>
        
     </ul> -->
   
</div>
            <div class="btn-group" style="margin-left:20px;">
 <!-- <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color:black">-->
      
      
      <!--<a href="#">Connection</a>-->
      <s:url value="connectionAction_viewconnection" var="viewconnection"/>
      <s:a href="%{viewconnection}">Connection</s:a>
      
      
  <!--</button>-->
   <!-- <ul class="dropdown-menu">
        <li><a href="contacts.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-user">&nbsp;Contacts</span></a></li>
        <li><a href="addConnection.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-glyphicon glyphicon-search"></span>&nbsp;Add</a></li>
        
        
     </ul> -->
   
</div>
            <div class="btn-group" style="margin-left:20px;">
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color:black">
      <a href="Location.html">Location</a>
  </button>
    <ul class="dropdown-menu">
       <li><a href="Location.html" style="color:#fff">&nbsp;<span class="glyphicon glyphicon-globe">&nbsp;Where</span></a></li> 
    </ul>
</div>
            
             </div>
            
  </nav>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      <%--        
        <!--------------------------------------------------------------------------------------------------------------->
        <h1>This is <%--${me.fname} ${me.lname}
            's home page from top page</h1>-->
            
            <div style="float:right">   
                <s:iterator value="notification" var="ntf">
                    <s:property value="#ntf.nt_content"/>&nbsp&nbsp&nbsp&nbsp
                    <s:property value="#ntf.nt_datetime"/>
                    <s:form action="otherprofileAction_viewotherprofile">
                        <s:hidden name="hisuid" value="%{#ntf.relating_uid}"></s:hidden>
                        <s:submit value="view me" class="buttoninput"/>
                    </s:form>
                    <br/>
            <br/>
                </s:iterator>
            </div>
        
        
        <s:form action="searchAction_dosimplesearch">
            <s:textfield name="simplestr" label="Search"></s:textfield>                       
            <s:submit value="SimpleSearch" class="buttoninput"/>
        </s:form>
            
            
        
        <s:url value="updateAction_viewhome" var="home"/>
        <strong><s:a href="%{home}">Home</s:a></strong>
        <br/>
        
        <s:url value="profileAction_viewprofile" var="profile"/>
        <strong><s:a href="%{profile}">Profile</s:a></strong>
        <br/>
        
        
        <br/>
        
        <s:url value="connectionAction_viewconnection" var="viewconnection"/>
        <s:url value="searchAction_viewadvsearch" var="advsearch"/>
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
--%>