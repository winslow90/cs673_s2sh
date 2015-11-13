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
        <section style="margin-top:90px;">
            <div class="container">
                <div class="col-md-8">
                     <div class="panel panel-default friends">
                         <div class="panel-heading">
                            <h3 class="panel-title">Result</h3>
                         </div>
                         <div class="panel-body">
                              <div class="row">
                                  <div class="col-sm-6 col-md-4">
                                    <div class="thumbnail">
                                        <img src="img/thumbnail.png" alt="..." style="width:130px;height:100px;border-radius:50%;">
                                            <div class="caption">
                                                <h4>Mike</h4>
                                                <p>New jersey institute of technology</p>
                                                <button type="submit" class="btn btn-success" style="width:211px;position:relative;left:-13px;">more detail</button>
        
                                             </div>
                                     </div>
                                    </div>
                                  
                              </div>
                         </div>
                         <nav>
  <ul class="pagination">
    <li>
      <button type="button" class="btn btn-info">First</button>
      
    </li>
    <li>
      <button type="button" class="btn btn-info">Previous</button>
      
    </li>
    <li><button type="button" class="btn btn-info">1</button></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <button type="button" class="btn btn-info">Previous</button>
      
    </li>
    <li>
      <button type="button" class="btn btn-info">Last</button>
    </li>
  </ul>
</nav>
                     </div>
                </div>
                
                
            </div>
        </section>
        
        
        
        
        
        
        
        <!------------------------------------------------------------------------------>
        <s:iterator value="resultUsersPage.records" var="con">            
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
                
                <%--
                <div id="userdiv${con.uid}addbtnbx">
                    <input type="button" id="userdiv${con.uid}addbtn" 
                           value="Append connection to ${con.lname}"/>
                </div>
                --%>
                
            </div>
        </s:iterator>
        
        <%--
        <script type="text/javascript">
            
            <s:iterator value="resultUsersPage.records" var="con">
                
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
        --%>
        
        
        <br/><br/><br/><br/>
        
        <div id="pagedirectors">
            
        
            <div style="float:left">
                <s:form action="searchAction_doadvsearch">
                    <s:hidden name="fnlike" ></s:hidden>
                    <s:hidden name="lnlike" ></s:hidden>
                    <s:hidden name="sumlike"></s:hidden>
                    <s:hidden name="loclike"></s:hidden>
                    <s:hidden name="unilike"></s:hidden>
                    <s:hidden name="skilike"></s:hidden>
                    <s:hidden name="comlike"></s:hidden>
                    <s:hidden name="lanlike"></s:hidden>
                    <s:hidden name="currentpage" value="1"></s:hidden>
                    <s:submit value="FirstPage" class="buttoninput"/>
                </s:form>
            </div>
            
             <div style="float:left">
                <s:form action="searchAction_doadvsearch">
                    <s:hidden name="fnlike" ></s:hidden>
                    <s:hidden name="lnlike" ></s:hidden>
                    <s:hidden name="sumlike"></s:hidden>
                    <s:hidden name="loclike"></s:hidden>
                    <s:hidden name="unilike"></s:hidden>
                    <s:hidden name="skilike"></s:hidden>
                    <s:hidden name="comlike"></s:hidden>
                    <s:hidden name="lanlike"></s:hidden>
                    <s:hidden name="currentpage" value="%{resultUsersPage.getPrePageNum()}"></s:hidden>
                    <s:submit value="PreviousPage" class="buttoninput"/>
                </s:form>
            </div>
            
            
            <s:iterator var="counter" begin="%{resultUsersPage.getStartPage()}" 
                        end="%{resultUsersPage.getEndPage()}" >
                <div style="float:left">
                    <s:form action="searchAction_doadvsearch">
                        <s:hidden name="fnlike" ></s:hidden>
                        <s:hidden name="lnlike" ></s:hidden>
                        <s:hidden name="sumlike"></s:hidden>
                        <s:hidden name="loclike"></s:hidden>
                        <s:hidden name="unilike"></s:hidden>
                        <s:hidden name="skilike"></s:hidden>
                        <s:hidden name="comlike"></s:hidden>
                        <s:hidden name="lanlike"></s:hidden>
                        <s:hidden name="currentpage" value="%{#counter}"></s:hidden>
                        <s:submit value="Page%{#counter}" class="buttoninput"/>
                    </s:form>
                </div>
            </s:iterator>
            
            
            <div style="float:left">
                <s:form action="searchAction_doadvsearch">
                    <s:hidden name="fnlike" ></s:hidden>
                    <s:hidden name="lnlike" ></s:hidden>
                    <s:hidden name="sumlike"></s:hidden>
                    <s:hidden name="loclike"></s:hidden>
                    <s:hidden name="unilike"></s:hidden>
                    <s:hidden name="skilike"></s:hidden>
                    <s:hidden name="comlike"></s:hidden>
                    <s:hidden name="lanlike"></s:hidden>
                    <s:hidden name="currentpage" value="%{resultUsersPage.getNextPageNum()}"></s:hidden>
                    <s:submit value="NextPage" class="buttoninput"/>
                </s:form>
            </div>
            
            
            <div style="float:left">
        
                <s:form action="searchAction_doadvsearch">
                    <s:hidden name="fnlike" ></s:hidden>
                    <s:hidden name="lnlike" ></s:hidden>
                    <s:hidden name="sumlike"></s:hidden>
                    <s:hidden name="loclike"></s:hidden>
                    <s:hidden name="unilike"></s:hidden>
                    <s:hidden name="skilike"></s:hidden>
                    <s:hidden name="comlike"></s:hidden>
                    <s:hidden name="lanlike"></s:hidden>
                    <s:hidden name="currentpage" value="%{resultUsersPage.getTotalPageNum()}"></s:hidden>
                    <s:submit value="LastPage" class="buttoninput"/>
                </s:form>
            </div>
            
            
        </div>
        
        
        <br/>
        
        <s:debug></s:debug>
    </body>
</html>
