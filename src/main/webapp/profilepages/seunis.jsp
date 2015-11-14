<%-- 
    Document   : seunis
    Created on : Nov 3, 2015, 7:26:45 PM
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
        this is the university selecting page
        <s:form action="universityAction_updateunis">
             <div class="form-group">
                    <label>School:</label><br/>
            
            <s:checkboxlist label="Please select your university" list="allunismap" 
	   name="myuniids" value="myuniids" /><br/>
             </div>
            <s:submit value="Submit update of unies" class="buttoninput"/>
        </s:form>
            <%--
        <form  action="create.html" method="post" data-toggle="validator" role="form">
                                         <div class="form-group">
                                             <ul>
                                                    <label>School:</label>
                                               <li>   
                                                <label>
                                                    <input type="checkbox" value="New Jersey Institute of Technology">
                                                        New Jersey Institute of Technology
                                                </label>
                                               </li>
                                               <li>
                                                 <label>
                                                      <input type="checkbox" value="Donghua University">
                                                        Donghua University
                                                 </label>
                                               </li>
                                               <li>
                                                 <label>
                                                      <input type="checkbox" value="North China Eletric Power University">
                                                        North China Eletric Power University
                                                 </label>
                                               </li>
                                               <li>
                                                 <label>
                                                      <input type="checkbox" value="Huazhong University of Science and Technology">
                                                        Huazhong University of Science and Technology
                                                 </label>
                                               </li>
                                                <li>
                                                 <label>
                                                      <input type="checkbox" value="Valparaiso Universit">
                                                        Valparaiso Universit
                                                 </label>
                                               </li>
                                               
                                             </ul>
                                         </div>
                                         <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> save</button>
                                        </form>
            --%>
    </body>
</html>
