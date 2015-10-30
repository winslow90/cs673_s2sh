<%-- 
    Document   : success
    Created on : Oct 27, 2015, 6:17:44 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/util.js"></script>
        
        <script type="text/javascript">
		window.onload=function(){
			document.getElementById("bt1").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("mycontent").innerHTML=
                                                            xhr.responseText;
						
						}
					}
				}
				xhr.open("GET","userAction_saveUser?time="+new Date().getTime());
				xhr.send(null);
			};
                        document.getElementById("bt2").onclick=function(){
				var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("mycontent2").innerHTML=
                                                            xhr.responseText;
						
						}
					}
				}
				xhr.open("GET","index.html?time="+new Date().getTime());
				xhr.send(null);
			};
		};
	</script>
        
    </head>
    <body>
        <h1>this success page!</h1>
        
        <div id="mycontent">
            
            content;
            
        </div>
        
        <input type="button" id="bt1" value="textajax"/>
        
        <div id="mycontent2">
            
            content2;
            
        </div>
        
        <input type="button" id="bt2" value="textajax"/>
        
    </body>
</html>
