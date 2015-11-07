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
        
        <hr/>
        
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
                
        
    </body>
</html>
