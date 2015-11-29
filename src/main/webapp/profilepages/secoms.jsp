<%-- 
    Document   : secoms
    Created on : Nov 4, 2015, 1:28:36 AM
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
        <s:form action="companyAction_updatecoms">
            <div class="form-group">
                <label>Companies:</label><br/>
                
                
                <s:iterator value="allcomsmap.entrySet()">
                    <li>   
                        <label>
                            <input name="mycomids" type="checkbox" value="<s:property value="key"/>"/>
                            <s:property value="value"/>
                        </label>
                    </li>
                </s:iterator>
                
                
                
                    <%--
                <s:checkboxlist label="Please select your company" list="allcomsmap" 
	   name="mycomids" value="mycomids" /><br/>
                    --%>
             </div>
            <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
            <%--<s:submit value="Submit update of comps" class="buttoninput"/>--%>
            
        </s:form>
        
        
        <%--
        <form  action="create.html" method="post" data-toggle="validator" role="form">
                                         <div class="form-group">
                                             <ul>
                                                    <label>Companies:</label>
                                               <li>   
                                                <label>
                                                    <input type="checkbox" value="Apple">
                                                        Apple Inc
                                                </label>
                                               </li>

                                               
                                             </ul>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
                                        </form>
        --%>
        
        
    </body>
</html>
