<%-- 
    Document   : Headerjsp
    Created on : Dec 9, 2021, 11:11:46 AM
    Author     : USER
--%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->


<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            a {
                text-decoration: none;
                color: inherit;
            }

            #Header {
                top: 0px;
                left: 0px;
                width: 100%;
                height: 92px;
                background: #000000 0% 0% no-repeat padding-box;
                border: 1px solid #707070;
                opacity: 1;
                display: grid;
                grid-template-columns: 300px auto 110px 30px 110px;
            }

            #HeaderHotelName {
                text-align: left;
                font: normal normal bold 25px/36px Sitka Small;
                letter-spacing: 0px;
                color: #AE9364;
                opacity: 1;

                margin-top:25px;
                margin-left: 15%;
            }

            #HeaderCountry {
                text-align: left;
                font: normal normal bold 18px/27px Sitka Small;
                letter-spacing: 0px;
                color: #FFFFFF;
                opacity: 1;

                margin-top:30px;
            }

            #HeaderAboutUs {
                text-align: left;
                font: normal normal bold 18px/27px Sitka Small;
                letter-spacing: 0px;
                color: #FFFFFF;
                opacity: 1;    
                
                margin-top: 30px;
            }

            #HeaderLanguage {
                text-align: left;
                font: normal normal bold 18px/27px Sitka Small;
                letter-spacing: 0px;
                color: #FFFFFF;
                opacity: 1;

                margin-top: 30px;
                margin-left: 5px;
            }
            
            #WorldWideWebImage {
                margin-top: 27px;
            }
        </style>
    </head>
    <body>
      <div id = "Header">
          <div><h4 id="HeaderHotelName"><a href="">HOTEL LYSANDER</a></h4></div>
          <div><h4 id="HeaderCountry">Sri Lanka</h4></div>
          <div><h4 id="HeaderAboutUs"><a href="">About-US</a></h4></div>
          <div><img src="Images/icons8-geography-50.png" alt="world-wibe-web-image" id="WorldWideWebImage"></div>
          <div><h4 id="HeaderLanguage">English</h4></div>
      </div>

    </body>
</html>
