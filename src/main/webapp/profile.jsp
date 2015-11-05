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
         <script type="text/javascript" src="js/util.js"></script>
         
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
         
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        
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
    </body>
</html>
