<%-- 
    Document   : selangs
    Created on : Nov 4, 2015, 1:28:45 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="languageAction_updatelangs">
            <div class="form-group">
            <label>languages:</label><br/>
            <s:checkboxlist label="Please select your languages" list="alllangsmap" 
	   name="mylangids" value="mylangids" />
            </div>
            <s:submit value="Submit update of languages" class="buttoninput"/>
        </s:form>
        
        
        <%--
        
        <form  action="create.html" method="post" data-toggle="validator" role="form">
                                         <div class="form-group">
                                             <ul>
                                                    <label>languages:</label>
                                               <li>   
                                                <label>
                                                    <input type="checkbox" value="english">
                                                        English
                                                </label>
                                               </li>

                                               
                                             </ul>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
                                        </form>
        
        
        --%>
        
    </body>
</html>
