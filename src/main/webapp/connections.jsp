<%-- 
    Document   : connections
    Created on : Nov 2, 2015, 5:40:14 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connection Page</title>
        <script type="text/javascript" src="js/util.js"></script>
        
        
        
    </head>
    
    <body>
        <%@ include file="top.jsp"%>
        
<section style="margin-top:90px;">
    <div class="container">
        <div class="row">
             <div class="col-md-8">
           <!-- <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">Add Friend</h3>
              </div>
              <div class="panel-body">
                <form action="#" method="post" data-toggle="validator" role="form">
            <div class="form-group">
                <label class="row-md-4 control-label" for="textinput">your friend's mail</label>       
  <div class="row-md-4">
  <input id="textinput" name="mail" type="email" placeholder="Email" class="form-control input-md" required autofocus> 
  </div>
</div>
                
                  <button type="submit" class="btn btn-default">Add</button>
                  
                </form>        
              </div>
            </div> -->
                 
            <div class="panel panel-default friends">
              <div class="panel-heading">
                <h3 class="panel-title">Connections</h3>
              </div>
              <div class="panel-body">
               <div class="row">
                   
                   
        <s:iterator value="connections" var="con">
            
            <div id="userdiv${con.uid}" class="col-sm-6 col-md-4">
                <div class="thumbnail">
                  <img src="${con.photo_url}" alt="..." style="width:100px;height:100px;border-radius:50%;">
                  <div class="caption">
                    <h4><s:property value="#con.fname"/>&nbsp&nbsp<s:property value="#con.lname"/></h4>
                    <p><s:property value="#con.gender"/></p>
                    
                    <s:form action="otherprofileAction_viewotherprofile">
                        <s:hidden name="hisuid" value="%{#con.uid}"></s:hidden>
                        <button type="submit" class="btn btn-success">View</button>
                    </s:form>
                        <div class="clear-fix"style="height:3px;"></div>  
                        
                    <div id="userdiv${con.uid}removebtnbx">
                        <button id="userdiv${con.uid}removebtn" type="button" class="btn btn-primary">Remove ${con.lname}</button>
                    </div>

                  </div>
                </div>
            </div>
        </s:iterator>
                   
                   
                   
  
                   
                  
</div>
              </div>
            </div>     
        </div>
    </div>
        
    </div>    
    
</section>

        <script type="text/javascript">
            
            <s:iterator value="connections" var="con">
                
                    document.getElementById("userdiv${con.uid}removebtn").onclick=function(){
                                var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("userdiv${con.uid}removebtnbx").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","addRemoveConAction_erasecon?time="+new Date().getTime()+"&&uidtoremovestr="+${con.uid});
				xhr.send(null);
                            };
            </s:iterator>
            
        </script>
    </body>
</html>






































    
    
    
    
    
    
    
    
    
    
    
    
        <%--
    <body>
        <%@ include file="top.jsp"%>
        
        <hr/>
        
        <h1>this is the connection page</h1>
        
       
        
        <s:iterator value="connections" var="con">
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
                
                <div id="userdiv${con.uid}removebtnbx">
                    <input type="button" id="userdiv${con.uid}removebtn" 
                           value="Remove connection to ${con.lname}"/>
                </div>
                
            </div>
        </s:iterator>
        
        
        
         <script type="text/javascript">
            
            <s:iterator value="connections" var="con">
                
                    document.getElementById("userdiv${con.uid}removebtn").onclick=function(){
                                var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("userdiv${con.uid}removebtnbx").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","addRemoveConAction_erasecon?time="+new Date().getTime()+"&&uidtoremovestr="+${con.uid});
				xhr.send(null);
                            };
            </s:iterator>
            
        </script>
        
        <s:debug></s:debug>
    </body>
</html>
--%>