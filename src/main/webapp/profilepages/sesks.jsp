<%-- 
    Document   : sesks
    Created on : Nov 4, 2015, 1:29:04 AM
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
        <s:form action="skillAction_updatesks">
            <div class="form-group">
                      <label>Skills:</label> <br/>
                      
                    <s:iterator value="allsksmap.entrySet()">
                        <li>   
                            <label>
                                <input name="myskids" type="checkbox" value="<s:property value="key"/>"
                                    <s:if test="myskids.contains(key)">
                                        checked
                                    </s:if>
                                />
                                <s:property value="value"/>
                            </label>
                        </li>
                        
                    </s:iterator>
                     
                        <%--            
            <s:checkboxlist label="Please select your skill" list="allsksmap" 
	   name="myskids" value="myskids" />
                        --%>
            
            
            </div>
            <%--<s:submit value="Submit update of skills" class="buttoninput"/>--%>
            <button value="Submit update of skills" type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
        </s:form>
        
        
        <%--
        
        <form  action="create.html" method="post" data-toggle="validator" role="form">
                                         <div class="form-group">
                                             <ul>
                                                    <label>Skills:</label>
                                               <li>   
                                                <label>
                                                    <input type="checkbox" value="skill1">
                                                        Skill1
                                                </label>
                                               </li>

                                               
                                             </ul>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
                                        </form>
        
        
        --%>
        
        
        
    </body>
</html>
