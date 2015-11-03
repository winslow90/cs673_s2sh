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
            
            ${sephoto_url}<br/>
            
            <input type="button" id="editicon" value="Edit my icon"/>
        
        </div>
        
        
        <hr/>
        <div id="myunis">
            <s:iterator value="myunis" var="uni">
                <s:property value="#uni.uni_name"/><br/>
                <s:property value="#uni.icon_url"/><br/>
                <br/>
            </s:iterator>
            <input type="button" id="editmyunis" value="Edit my universities"/>
        </div>>
        <hr/>
        <div id="myskills">
            <s:iterator value="myskils" var="sk">
                <s:property value="#sk.sk_name"/>
                <br/>
            </s:iterator>
        </div>
        <hr/>
        <div id="mycoms">
            <s:iterator value="mycoms" var="cp">
                <s:property value="#cp.cp_name"/><br/>
                <s:property value="#cp.icon_url"/><br/>
            </s:iterator>
        </div>
        <hr/>
        <div id="mylangs">
            <s:iterator value="mylangs" var="lang">
                <s:property value="#lang.lang_name"/><br/>
            </s:iterator>
        </div>
        <hr/>
    </body>
</html>
