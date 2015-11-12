<%-- 
    Document   : otherprofile
    Created on : Nov 6, 2015, 8:00:19 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/util.js"></script>
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        
        <button onclick="javascript:history.back(-1);" type="button" class="btn btn-success" style="margin-top:80px;">Return to previous page</button>
           <section style="margin-top:90px;">
               
      <div class="container">
        <div class="row">
          <div class="col-md-8">
            <div class="profile">
                <h1 class="page-header">${hisfname} &nbsp; ${hislname}</h1>
              <div class="row">
                <div class="col-md-4">
                  <img src="${hisphotofilename}" class="img-thumbnail">
                  <div class="clearfix"style="height:10px;"></div>
                  
                  
                  
                          
        <s:if test="%{thediff}">
            <s:if test="%{theremove}">
                <div id="userdiv${he.uid}removebtnbx">
                    <button id="userdiv${he.uid}removebtn" type="button" class="btn btn-primary" style="margin-left:68px;">Remove connection to ${he.lname}</button>
                </div>
                
                <script type="text/javascript">
                    document.getElementById("userdiv${he.uid}removebtn").onclick=function(){
                                    var xhr = getXmlHttpRequest();
                                    xhr.onreadystatechange=function(){
                                            if(xhr.readyState==4){
                                                    if(xhr.status==200){
                                                        document.getElementById("userdiv${he.uid}removebtnbx").innerHTML=
                                                                xhr.responseText;
                                                        delete xhr;
                                                    }
                                            }
                                    }
                                    xhr.open("GET","addRemoveConAction_erasecon?time="+new Date().getTime()+"&&uidtoremovestr="+${he.uid});
                                    xhr.send(null);
                                };
                </script>
                
            </s:if>
            <s:else>
                <div id="userdiv${he.uid}addbtnbx">
                    <button id="userdiv${he.uid}addbtn" type="button" class="btn btn-primary" style="margin-left:68px;">Append connection to ${he.lname}</button>
                </div>
                
                
                <script type="text/javascript">

                            document.getElementById("userdiv${he.uid}addbtn").onclick=function(){
                                        var xhr = getXmlHttpRequest();
                                        xhr.onreadystatechange=function(){
                                                if(xhr.readyState==4){
                                                        if(xhr.status==200){
                                                            document.getElementById("userdiv${he.uid}addbtnbx").innerHTML=
                                                                    xhr.responseText;
                                                            delete xhr;
                                                        }
                                                }
                                        }
                                        xhr.open("GET","addRemoveConAction_appendcon?time="+new Date().getTime()+"&&uidtoaddstr="+${he.uid});
                                        xhr.send(null);
                                    };
                </script>
                
                
            </s:else>
        </s:if>
                  
                  
                </div>
                <div class="col-md-8">
                  <ul>
                    
                    <li style="font-size:18px;"><strong>Gender: </strong>${hisgender}</li>
                    <li style="font-size:18px;"><strong>Email Address: </strong>${hisemail}</li>
                    <li ><strong style="font-size:18px;">Summary: </strong><p>${hissummary}</p>



.</li>
                  </ul>

                </div>
              </div>
            </div>
          <div class="education">
               <h1 class="page-header">Education</h1>
              
                <s:iterator value="hisunis" var="uni">
                    <div class="row">

                     <div class="col-md-4">
                         <img src="<s:property value="#uni.icon_url"/>" class="img-thumbnail">
                     </div>

                     <div class="col-md-6">
                       <ul>

                           <li style="font-size:18px;"> <span class="glyphicon glyphicon-pushpin" ></span>&nbsp;&nbsp;<strong ><!--university name--><s:property value="#uni.uni_name"/></strong></li>

                       </ul>

                     </div>
                    </div>
                </s:iterator>
              
              
          </div>
          
          
        
          </div><!-- col-md-8 end -->
      
          
        </div>
          
        <div class="row">
            <div class="col-md-8">
                <div class="experience">
                   <h1 class="page-header">Experience</h1> 
                   
                   <s:iterator value="hiscoms" var="comp">
                   
                            
                    <div class="row">
                            <div class="col-md-4">
                          <img src="<s:property value="#comp.icon_url"/>" class="img-thumbnail">
                        </div>
                        <div class="col-md-6">
                            <ul>
                              <li style="font-size:18px;"><span class="glyphicon glyphicon-briefcase" ></span>&nbsp;&nbsp;<strong><!--university name-->Company: </strong><s:property value="#comp.cp_name"/></li>

                            </ul>

                          </div>
                    </div>
                      
                    </s:iterator>
                    
                </div>
            </div>
        </div>
          

          
           <div class="row">
            <div class="col-md-8">
                <div class="Skills">
                    <h1 class="page-header">Skills</h1>
                    
                    <s:iterator value="hisskils" var="sk">
                     
                    <div class="row">
                            <div class="col-md-4">
                                                   <label style="font-size:18px;">
                             <span class="glyphicon glyphicon-wrench" ></span>

                            </label>
                       </div>
                     <div class="col-md-6">
                         <ul>
                           <li style="font-size:18px;"><s:property value="#sk.sk_name"/></li>

                         </ul>

                       </div>
                    </div>
                           
                    </s:iterator>  
                


 
                     
                    
                </div>
            </div>
        </div>
                    <div class="row">
            <div class="col-md-8">
                <div class="Skills">
                    <h1 class="page-header">Language</h1>
                    
                    
                    <s:iterator value="hislangs" var="lang">

                        <div class="row">
                                                <div class="col-md-4">
                                                    <label style="font-size:18px;">
                              <span class="glyphicon glyphicon-leaf" ></span>

                             </label>
                                           </div>
                                         <div class="col-md-6">
                                             <ul>
                                               <li style="font-size:18px;"><s:property value="#lang.lang_name"/></li>

                                             </ul>

                                           </div>
                        </div>
                    </s:iterator>
                    
                    
                </div>
            </div>
        </div> 
          
      </div>

    </section>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!---------------------------------------------------------------------------------------------------->
        
        
        <%--
        
        <hr/>
        
        <input type="button" onclick="javascript:history.back(-1);" value="Go to previous page">
        
        <div id="iconprofile">
            
            
            <img src="${hisphotofilename}" height="50" width="50" /> <br/>
            
        </div>
        
        
        <div id="basicprofile">
            ${hisemail}<br/>
            ${hisfname}<br/>
            ${hislname}<br/>
            ${hisgender}<br/>
            ${hissummary}<br/>
        </div>
            
            
        <s:iterator value="hisunis" var="uni">
            <s:property value="#uni.uni_name"/>&nbsp&nbsp&nbsp&nbsp
            <s:property value="#uni.icon_url"/>&nbsp&nbsp&nbsp&nbsp
            <br/>
        </s:iterator>
                
        <s:iterator value="hisskils" var="sk">
                <s:property value="#sk.sk_name"/>&nbsp&nbsp&nbsp&nbsp
                <br/>
        </s:iterator>        
        
        <s:iterator value="hiscoms" var="comp">
                <s:property value="#comp.cp_name"/>&nbsp&nbsp&nbsp&nbsp
                <s:property value="#comp.icon_url"/>&nbsp&nbsp&nbsp&nbsp
                <br/>
        </s:iterator>
                
                
         <s:iterator value="hislangs" var="lang">
                <s:property value="#lang.lang_name"/>&nbsp&nbsp&nbsp&nbsp
        </s:iterator>
                
                
        <s:if test="%{thediff}">
            <s:if test="%{theremove}">
                <div id="userdiv${he.uid}removebtnbx">
                    <input type="button" id="userdiv${he.uid}removebtn" 
                           value="Remove connection to ${he.lname}"/>
                </div>
                
                <script type="text/javascript">
                    document.getElementById("userdiv${he.uid}removebtn").onclick=function(){
                                    var xhr = getXmlHttpRequest();
                                    xhr.onreadystatechange=function(){
                                            if(xhr.readyState==4){
                                                    if(xhr.status==200){
                                                        document.getElementById("userdiv${he.uid}removebtnbx").innerHTML=
                                                                xhr.responseText;
                                                        delete xhr;
                                                    }
                                            }
                                    }
                                    xhr.open("GET","addRemoveConAction_erasecon?time="+new Date().getTime()+"&&uidtoremovestr="+${he.uid});
                                    xhr.send(null);
                                };
                </script>
                
            </s:if>
            <s:else>
                <div id="userdiv${he.uid}addbtnbx">
                    <input type="button" id="userdiv${he.uid}addbtn" 
                           value="Append connection to ${he.lname}"/>
                </div>
                
                
                <script type="text/javascript">

                            document.getElementById("userdiv${he.uid}addbtn").onclick=function(){
                                        var xhr = getXmlHttpRequest();
                                        xhr.onreadystatechange=function(){
                                                if(xhr.readyState==4){
                                                        if(xhr.status==200){
                                                            document.getElementById("userdiv${he.uid}addbtnbx").innerHTML=
                                                                    xhr.responseText;
                                                            delete xhr;
                                                        }
                                                }
                                        }
                                        xhr.open("GET","addRemoveConAction_appendcon?time="+new Date().getTime()+"&&uidtoaddstr="+${he.uid});
                                        xhr.send(null);
                                    };
                </script>
                
                
            </s:else>
        </s:if>
                
        --%>
        
    </body>
</html>
