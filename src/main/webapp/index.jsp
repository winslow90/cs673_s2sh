<%-- 
    Document   : index
    Created on : Oct 27, 2015, 7:18:31 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/logo1.png">

    <title>World's Largest Professional Netwrok|Linkedin</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/style1.css" rel="stylesheet">    
    <s:head/>
   
  </head>

  <body onload="myFunction()">

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#"><img src="img/logo.png"></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" method="post" action="${pageContext.request.contextPath}/userAction_login.action">
            <div class="form-group" >
                <input name="logemail" type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus >
            </div>
            <div class="form-group col-xs-10" style="color:red;">
                <s:actionerror/>
            </div>
            <div class="form-group">
                <input name="logpd" type="password" placeholder="Password" class="form-control" required>
                 <input type="hidden" id="lat" name="lantitudestr">
                 <input type="hidden" id="lon" name="longitudestr">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->

<div class="jumbotron"style="background-image: linear-gradient(rgba(0,0,0,0.2), rgba(0,0,0,0.2)),url(img/bg.jpg); height:800px; margin-buttom:0 auto;">
    <div class="container">
        <h3>Be great at what you do</h3>
        <h4>Get started - it's free</h4>
        <form  method="post" action="${pageContext.request.contextPath}/userAction_register.action"  data-toggle="validator" role="form">
            <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">First name</label>       
  <div class="row-md-4">
  <input id="textinput" name="fname" type="text" placeholder="First name" class="form-control input-md" required autofocus> 
  </div>
</div>
            <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">Last name</label>       
  <div class="row-md-4">
  <input id="textinput" name="lname" type="text" placeholder="Last name" class="form-control input-md" required autofocus> 
  </div>
</div>
            <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">Email</label>       
  <div class="row-md-4">
  <input id="textinput" name="email" type="email" placeholder="Email" class="form-control input-md" required autofocus> 
  </div>
               
</div>
            <div class="form-group">
                <label for="inputPassword" class="control-label">Password</label>      
  <div class="row-md-4">
   <input name="pd" type="password" data-minlength="6" class="form-control" id="inputPassword" placeholder="Password" required>
      
  </div>
</div>
             <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">confirm</label>       
  <div class="row-md-4">
  <input name="pd" type="password" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="Confirm" required>
      <div class="help-block with-errors"></div>
  </div>
</div>
            
            <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">gender</label>       
  <div class="row-md-4">
      <input type="hidden" id="latRe" name="lantitudestr">
      <input type="hidden" id="lonRe" name="longitudestr">
  <s:select list="{'Male','Female'}" headerKey="Unknown" headerValue="-" name="gender"></s:select>
  </div>
</div>
            
            
            <p style="text-align: center; font-size:12px">By clicking Join now, you agree to LinkedIn's <a>User Agreement</a>, <a>Privacy Policy</a>, and <a>Cookie Policy</a></p>
            <div class="form-group">
                <div class="row-md-4">
                   <button type="submit" class="btn btn-success btn-lg btn-block">Join us</button> 
                    
                     
          </form>
                    
                </div>
            </div>  
        
        
    </div>
</div>
 <nav class="navbar navbar-inverse navbar-fixed-bottom">
    <div class="container">

      <footer>
          <p>&copy; <img src="img/minilogo.png">&nbsp;<color style="color:#fff"> 2015 &nbsp;</color> </p>
      </footer>
    </div> <!-- /container -->
      </nav>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
      <script src="js/validator.js"></script>
      <script>
   var x = document.getElementById("lat");
   var y = document.getElementById("lon");
    var x1 = document.getElementById("latRe");
    var y1 = document.getElementById("lonRe");
  function showPosition(position)
  {
    x.value=position.coords.latitude;  
    y.value=position.coords.longitude; 
    x1.value = position.coords.latitude;
    y1.value = position.coords.longitude;
  }
    function myFunction()
    {
       if (navigator.geolocation) 
    {
    navigator.geolocation.getCurrentPosition(showPosition);
    }
     else{x.innerHTML="Geolocation is not supported by this browser.";} 
    }
    
</script>
      
  </body>
</html>













<!----------------------------------------------------------------------------->
<%--
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
--%>