<%-- 
    Document   : home.jsp
    Created on : Nov 2, 2015, 3:37:00 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> ${me.fname} ${me.lname}
            Home Page</title>
    </head>
    <body>
        
        <%@ include file="top.jsp"%>
        
        <section style="margin-top:90px;">
      <div class="container">
        <div class="row">
          <div class="col-md-8">
            

            <div class="panel panel-default post">
                <div class="panel-heading">
                <h3 class="panel-title">Moments</h3>
              </div>
              <div class="panel-body">
                <div class="row">
                  <div class="col-sm-2">
                    <a class="post-avatar thumbnail" href="profile.html" style="height:80px;width:80px"><img src="img/thumbnail.png" style="height:60px;width:60px;border-radius:50%"><div class="text-center">Mike</div></a>
                    
                  </div><!-- col-sm-2 end -->
                  <div class="col-sm-10">
                    <div class="bubble">
                      <div class="pointer">
                        <p>I am a software engineer from Amazon and I have experience of programming about three years in java ee field. I have a lot of achievement in the passed three year <button type="submit" class="btn btn-primary btn-xs"style="border-radius: 24px;">Fname-Lname</button> </p>
                      </div>
                      <div class="pointer-border"></div>
                    </div><!-- bubble end -->
                    
                    
                    <div class="clearfix"></div>

                   <!-- <div class="comments">
                      <div class="comment" style="border-style:none;">
                        <div class="comment-text">
                           <button type="submit" class="btn btn-success btn-lg"style="border-radius: 24px;">View</button>
                        </div>
                      </div>
                      <div class="clearfix"></div>

                    
                      <div class="clearfix"></div>
                    </div> -->
                  </div>
                </div>
              </div>
            </div>




          </div><!-- col-md-8 end -->
           <div class="col-md-4">
            <div class="panel panel-default friends">
              <div class="panel-heading">
                <h3 class="panel-title">People you may want to know</h3>
              </div>
              <div class="panel-body">
                <ul>
                   
                  <li> <button type="button" class="btn btn-primary btn-xs" style="background-color:#fff;border-style:none;"><img src="img/thumbnail.png" style="border-radius:50%"></button></li>
                 
                
                </ul>
                  
                <div class="clearfix"></div>
                 
              </div>
            </div>

            
          </div>  

        </div>
      </div>

    </section>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!--------------------------------------------------------------------------------------------- -->
        <hr/>
        
        <h1>this is the home page</h1>
        
        
        <hr/>
        <h3>this is recommendation</h3>
        <s:iterator value="recommendation" var="con">
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
                
            </div>
        </s:iterator>
        
        <hr/>
        
        <s:iterator value="updates" var="up">
            <s:property value="#up.up_content"/>
            <s:property value="#up.up_datetime"/>
            <s:property value="#up.relating_photo_url"/>
            
            <s:form action="otherprofileAction_viewotherprofile">
                <s:hidden name="hisuid" value="%{#up.relating_uid}"></s:hidden>
                <s:submit value="view me" class="buttoninput"/>
            </s:form>
            <br/>
        </s:iterator>
        
        <s:debug></s:debug>
    </body>
</html>
