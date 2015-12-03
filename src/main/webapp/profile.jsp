<%-- 
    Document   : profile
    Created on : Nov 2, 2015, 5:40:40 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        
    
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        
        <script src="js/validator.min.js"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet">
         <script type="text/javascript" src="js/util.js"></script>
         
         <%--
         
         <script type="text/javascript">
		window.onload=function(){
			document.getElementById("editbasic").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("basicprofile").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","profileAction_selectbasic?time="+new Date().getTime());
				xhr.send(null);
			};
                        
                        document.getElementById("editicon").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("iconprofile").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","profileAction_selecticon?time="+new Date().getTime());
				xhr.send(null);
			};
                        document.getElementById("editmyunis").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("myunis").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","universityAction_selectunis?time="+new Date().getTime());
				xhr.send(null);
			};
                        document.getElementById("editmysks").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("myskills").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","skillAction_selectsks?time="+new Date().getTime());
				xhr.send(null);
			};
                        document.getElementById("editmycoms").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("mycoms").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","companyAction_selectcoms?time="+new Date().getTime());
				xhr.send(null);
			};
                        document.getElementById("editmylangs").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("mylangs").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","languageAction_selectlangs?time="+new Date().getTime());
				xhr.send(null);
			};
		};               
	</script>
         --%>
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        
        <section style="margin-top:90px;">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="basic_profile ">
                            <h2 class="page-header">Basic Personal Info</h2>
                              <ul>
                                    <li style="font-size:18px;"><strong>Name: ${sefname}  ${selname}</strong></li>
                                    <li style="font-size:18px;"><strong>Gender:${segender} </strong></li>
                                    <li style="font-size:18px;"><strong>Email Address: ${seemail} </strong></li>
                                    <li ><strong style="font-size:18px;">Summary:${sesummary} </strong><p></p>.</li>
                              </ul>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#basic">Edit MyBasic</button> 
                   </div>
                    
                    <!--Modal--->
                    <div class="modal fade" id="basic" role="dialog">
                         <div class="modal-dialog">
                             <!-- Modal content-->
                             <div class="modal-content">
                                 <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My Basic</h4>      
                                </div>
                                 <div class="modal-body" style="padding:40px 50px;">
                                     
                                     <form  action="${pageContext.request.contextPath}/profileAction_updatebasic.action" method="post" data-toggle="validator" role="form">
                                          <div class="form-group">
                                                <label for="inputPassword" class="control-label">Password</label>      
                                                <div class="row-md-4">
                                                    <input name="sepd" type="password" data-minlength="6" class="form-control" id="inputPassword" placeholder="Password">
      
                                                </div>
                                           </div>
                                           <div class="form-group">
                                                <label class="row-md-4 control-label" for="textinput">confirm</label>       
                                                <div class="row-md-4">
                                                    <input name="sepd" type="password" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="Confirm">
                                                    <div class="help-block with-errors"></div>
                                                </div>
                                          </div>
                                           <div class="form-group">
                                              <label class="row-md-4 control-label" for="textinput">First name</label>       
                                               <div class="row-md-4">
                                                    <input id="textinput" name="sefname" type="text" placeholder="First name" class="form-control input-md"> 
                                               </div>
                                          </div>
                                          <div class="form-group">
                                                <label class="row-md-4 control-label" for="textinput">Last name</label>       
                                                <div class="row-md-4">
                                                <input id="textinput" name="selname" type="text" placeholder="Last name" class="form-control input-md"> 
                                                </div>
                                         </div>
                                         <div class="form-group">
                                            <label class="row-md-4 control-label" for="textinput">Gender</label>
                                            <div class="row-md-4">
                                            <select class="selectpicker" name="segender" >
                                                <option>male</option>
                                                <option>female</option>
                                            </select>
                                            </div>
                                         </div>
                                         <div class="form-group">
                                             <label class="row-md-4 control-label" for="textinput">Personal</label>
                                             <textarea name="sesummary" class="form-control" rows="3"></textarea>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Save</button>
                                     </form>
                                 </div>
                             </div>
                             <div class="modal-footer">
                                <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
         
                             </div>
                         </div>
                    </div>
                    
                </div>
                
                
                
                <div class="row">
                    <div class="col-md-8">
                        <div class="avatar">
                           <h2 class="page-header">Avatar Photo</h2>
                            <img src="${sephotoFileName}" style="border-radius:50%;width:100px;height:100px">
                            
                        </div>
                        <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#avatar">Edit MyAvatar</button> 
                        </div>
                        
                        
                        <div class="modal fade" id="avatar" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                     <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My Avatar</h4>      
                                     </div>
                                    <div class="modal-body" style="padding:40px 50px;">
                                        
                                        <s:form action="profileAction_updateicon" enctype="multipart/form-data">
                                         <div class="form-group">
                                             <label class="row-md-4 control-label" for="textinput">Avatar</label>
                                             <s:file name="sephoto" label="Please select your new icon file"></s:file>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Save</button>
                                        </s:form>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
                
                  <div class="row">
                    <div class="col-md-8">
                        <div class="avatar">
                           <h2 class="page-header">Education</h2>
                            <ul>
                                  <s:action name="universityAction_listunis" executeResult="true"/>
                              </ul>
                            
                        </div>
                        <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#school">Edit My School</button> 
                        </div>
                        
                        
                        <div class="modal fade" id="school" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                     <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My School</h4>      
                                     </div>
                                    <div class="modal-body" style="padding:40px 50px;">
                                        <s:action name="universityAction_selectunis" executeResult="true"/>
                                        
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
                
                    <div class="row">
                    <div class="col-md-8">
                        <div class="avatar">
                           <h2 class="page-header">Skills</h2>
                            <ul>
                                
                                <s:action name="skillAction_listsks" executeResult="true"/>
                                  
                              </ul>
                            
                        </div>
                        <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#skill">Edit My Skills</button> 
                        </div>
                        
                        
                        <div class="modal fade" id="skill" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                     <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My Skill</h4>      
                                     </div>
                                    <div class="modal-body" style="padding:40px 50px;">
                                        <s:action name="skillAction_selectsks" executeResult="true"/>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
                
                  <div class="row">
                    <div class="col-md-8">
                        <div class="avatar">
                           <h2 class="page-header">Company</h2>
                            <ul>
                                <s:action name="companyAction_listcoms" executeResult="true"/>
                              </ul>
                            
                        </div>
                        <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#company">Edit My Companies</button> 
                        </div>
                        
                        
                        <div class="modal fade" id="company" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                     <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My Company</h4>      
                                     </div>
                                    <div class="modal-body" style="padding:40px 50px;">
                                        <s:action name="companyAction_selectcoms" executeResult="true"/>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-8">
                        <div class="avatar">
                           <h2 class="page-header">Languages</h2>
                            <ul>
                                <s:action name="languageAction_listlangs" executeResult="true"/>
                                  
                              </ul>
                            
                        </div>
                        <div class="col-md-8">
                        <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#language">Edit My Languages</button> 
                        </div>
                        
                        
                        <div class="modal fade" id="language" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                     <div class="modal-header" style="padding:35px 50px;">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h4><span class="glyphicon glyphicon-lock"></span>Edit My Languages:</h4>      
                                     </div>
                                    <div class="modal-body" style="padding:40px 50px;">
                                        <s:action name="languageAction_selectlangs" executeResult="true"/>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
                
            </div>
        </section>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                                        <%--
        
        
        
        <!------------------------------------------------------------------>
        <hr/>
        <div id="basicprofile">
            ${seemail}<br/>
            ${sepd[0]}<br/>
            ${sefname}<br/>
            ${selname}<br/>
            ${segender}<br/>
            ${sesummary}<br/>
            <input type="button" id="editbasic" value="Edit mybasic"/>
        </div>
            
        <div id="iconprofile">
            
            
            <img src="${sephotoFileName}" height="50" width="50" /> <br/>
            
            <input type="button" id="editicon" value="Edit my icon"/>
            
        
        </div>
        
        
        <hr/>
        <div id="myunis">
            
            <s:action name="universityAction_listunis" executeResult="true"/>
            
            <input type="button" id="editmyunis" value="Edit my universities"/>
        </div>
        <hr/>
        <div id="myskills">
            <s:action name="skillAction_listsks" executeResult="true"/>
            
            <input type="button" id="editmysks" value="Edit my skills"/>
        </div>
        <hr/>
        <div id="mycoms">
            <s:action name="companyAction_listcoms" executeResult="true"/>
            
            <input type="button" id="editmycoms" value="Edit my companies"/>
        </div>
        <hr/>
        <div id="mylangs">
            <s:action name="languageAction_listlangs" executeResult="true"/>
            
            <input type="button" id="editmylangs" value="Edit my languages"/>
        </div>
        <hr/>
                                        --%>
    </body>
</html>
