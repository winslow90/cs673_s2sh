<%-- 
    Document   : iconinput
    Created on : Nov 3, 2015, 12:29:48 AM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Icon Input Page</title>
    </head>
    <body>
        <s:form action="profileAction_updateicon" enctype="multipart/form-data">
            <s:file name="sephoto" label="Please select your new icon file"></s:file>
            <s:submit value="Upload new icon file"></s:submit>
        </s:form>
    </body>
</html>
