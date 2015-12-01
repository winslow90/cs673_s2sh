<%-- 
    Document   : connectiononmap
    Created on : Nov 12, 2015, 4:48:17 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
     <style type="text/css">
  html { height: 100% }
  body { height: 100%; margin: 0; padding: 0 }
  #map_canvas { height: 100% }
</style>
<script type="text/javascript"
  src=
"http://maps.googleapis.com/maps/api/js?key=AIzaSyAk23COkvyw_SCdJd3w2FYUX8NAj6Zu5Y8&sensor=false">
</script>
<script type="text/javascript">

    

var locations = [
    
    <s:iterator value="connections" var="con" status="stat">
            
        <s:if test="#stat.index>0">,</s:if>['<s:property value="#con.lname"/>', <s:property value="#con.lantitudestr"/>, <s:property value="#con.longitudestr"/>, '<s:property value="#con.location"/>','<s:property value="#con.photo_url"/>','<s:property value="#con.summary"/>']
        
    </s:iterator>   
  
  ];

  function initialize() {

    var myOptions = {
      center: new google.maps.LatLng(40.74374353462223, -74.1807606691487),
      zoom: 8,
      mapTypeId: google.maps.MapTypeId.ROADMAP

    };
    var map = new google.maps.Map(document.getElementById("default"),
        myOptions);

    setMarkers(map,locations)

  }



  function setMarkers(map,locations){

      var marker, i

for (i = 0; i < locations.length; i++)
 {  
 
     
 var loan = locations[i][0]
 var lat = locations[i][1]
 var long = locations[i][2]
 var add =  locations[i][3]
var icon = {
     url:locations[i][4],
      scaledSize: new google.maps.Size(50, 50), // scaled size
    origin: new google.maps.Point(0,0), // origin
    anchor: new google.maps.Point(0, 0) // anchor
    };
var ps = locations[i][5];
 latlngset = new google.maps.LatLng(lat, long);

  var marker = new google.maps.Marker({ 
        icon:icon,
          map: map, title: loan , position: latlngset  
        });
        map.setCenter(marker.getPosition())


        var content = "Name: " + loan +  '</h3>' + "Address: " + add +'<br/>' + "ps:" + ps   

  var infowindow = new google.maps.InfoWindow()

google.maps.event.addListener(marker,'click', (function(marker,content,infowindow){ 
        return function() {
           infowindow.setContent(content);
           infowindow.open(map,marker);
           if (marker.getAnimation() !== null) {
    marker.setAnimation(null);
  } else {
    marker.setAnimation(google.maps.Animation.BOUNCE);
  }
        };
        
        
        
        
    })(marker,content,infowindow)); 

  }
  }



  </script>     
        
        
        
    </head>
<body onload="initialize()">
        <%@ include file="top.jsp"%>
        <section style="margin-top:90px;">
            <div class="container" >
          
          
      <div class="row" id="default" style="width:100%;height:1024px;position: absolute;top:-10px;left:15px;'">   </div> 
         <!-- <div class="col-md-12"id="default" style="width:1000px;height:1000px;">-->
            
   
        

          
        
      </div>
    </div>
    </section>
    </body>
</html>
