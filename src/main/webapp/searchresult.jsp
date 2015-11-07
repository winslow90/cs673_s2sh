<%-- 
    Document   : result
    Created on : Nov 2, 2015, 5:41:17 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/util.js"></script>
    </head>
    <body>
        <%@ include file="top.jsp"%>
        
        <s:iterator value="resultUsers" var="con">            
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
                
                <div id="userdiv${con.uid}addbtnbx">
                    <input type="button" id="userdiv${con.uid}addbtn" 
                           value="Append connection to ${con.lname}"/>
                </div>
                
            </div>
        </s:iterator>
        
        <script type="text/javascript">
            
            <s:iterator value="resultUsers" var="con">
                
                    document.getElementById("userdiv${con.uid}addbtn").onclick=function(){
                                var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("userdiv${con.uid}addbtnbx").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","addRemoveConAction_appendcon?time="+new Date().getTime()+"&&uidtoaddstr="+${con.uid});
				xhr.send(null);
                            };
            </s:iterator>
            
        </script>
        
        
        
        <s:debug></s:debug>
    </body>
</html>
