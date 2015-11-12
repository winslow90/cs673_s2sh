<%-- 
    Document   : connectiononmap
    Created on : Nov 12, 2015, 4:48:17 PM
    Author     : superman90
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  ['loan 1', 40.743743534622232, -74.1807606691487, 'address 1','img/thumbnail.jpeg','I am softawre enginner from amazon'],
  ['loan 2', 40.7438,-74.181, 'address 2',' img/thumbnail.jpeg','I am softawre enginner from amazon'],
  ['loan 3', 40.75, -74.181, 'address 3','img/thumbnail3.jpeg','I am softawre enginner from amazon'],
  ['loan 4', 40.74, -74.281, 'address 4','img/thumbnail3.jpeg','I am softawre enginner from amazon'],
  ['loan 5', 40.7439, -74, 'address 5',' img/thumbnail2.jpeg','I am softawre enginner from amazon' ]
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
var icon =  locations[i][4];
var ps = locations[i][5];
 latlngset = new google.maps.LatLng(lat, long);

  var marker = new google.maps.Marker({ 
        icon:icon,
          map: map, title: loan , position: latlngset  
        });
        map.setCenter(marker.getPosition())


        var content = "Loan Number: " + loan +  '</h3>' + "Address: " + add +'<br/>' + "ps:" + ps   

  var infowindow = new google.maps.InfoWindow()

google.maps.event.addListener(marker,'click', (function(marker,content,infowindow){ 
        return function() {
           infowindow.setContent(content);
           infowindow.open(map,marker);
        };
    })(marker,content,infowindow)); 

  }
  }



  </script>     
        
        
        
    </head>
<body onload="initialize()">
        <%@ include file="top.jsp"%>
        <section style="margin-top:90px;">
      <div class="container"  >
        <div class="row" id="default" style="width:2000px;height:1420px;">
         <!-- <div class="col-md-12"id="default" style="width:1000px;height:1000px;">
            
   
        

          
        </div>-->
      </div>
    </div>
    </section>
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <hr/>
        this is the map
        
        <hr/>
        
        <h1>this is the connection page</h1>
        
       
        
        <s:iterator value="connections" var="con">
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
                
                <div id="userdiv${con.uid}removebtnbx">
                    <input type="button" id="userdiv${con.uid}removebtn" 
                           value="Remove connection to ${con.lname}"/>
                </div>
                
            </div>
        </s:iterator>
        
        
        
         <script type="text/javascript">
            
            <s:iterator value="connections" var="con">
                
                    document.getElementById("userdiv${con.uid}removebtn").onclick=function(){
                                var xhr = getXmlHttpRequest();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
						    document.getElementById("userdiv${con.uid}removebtnbx").innerHTML=
                                                            xhr.responseText;
                                                    delete xhr;
						}
					}
				}
				xhr.open("GET","addRemoveConAction_erasecon?time="+new Date().getTime()+"&&uidtoremovestr="+${con.uid});
				xhr.send(null);
                            };
            </s:iterator>
            
        </script>
        
        <s:debug></s:debug>
    </body>
</html>
