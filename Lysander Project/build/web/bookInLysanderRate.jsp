<%-- 
    Document   : bookInLysanderRates
    Created on : Jan 7, 2022, 1:45:07 AM
    Author     : USER
--%>


<%@page import="Model.bookInLysanderRateModel"%>
<%
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <!--  jQuery -->
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
        <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
        <!-- Bootstrap Date-Picker Plugin -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
        <title>JSP Page</title>
    </head>
    <style>

        body
        {
            background-image: url("image.png");  
            background-attachment: fixed;
        }

        #background
        {
            margin-top: 50px;
            margin-bottom: 50px;
        }

        #leftcolumn
        {
            border: 2px;
            border-radius: 20px;
            opacity: 0.95;
            margin-left: 50px;
            margin-right: 50px;
        }
        #rightcolumn
        {
            border: 2px;
            border-radius: 20px;
            opacity: 0.95;
            margin-left: 50px;
            margin-right: 50px;
        }
        #column1
        {

            margin-top: 0px;
            background-color: transparent;
        }
        .heading
        {
            font-size: 25px;
            color: #9e6c1c;
            text-align: center;
        }
        .headingRoomAvailability {
            font-size: 25px;
            text-align: center;
        }
        .heading#booking
        {
            font-size: 35px;
            font-weight: bold;
        }
        #container1
        {
            margin-top: 0px;
        }
        #buttons
        {
            border-radius: 12px;
            background-color: #9e6c1c;
        }
        #labels
        {
            text-align: center;
            font-weight: bold;
        }
        #labels1
        {
            text-align: center;
        }
        #textbox
        {
            margin-right: 90px;
        }
        #floatingInput1
        {
            border-radius: 20px;
        }

    </style>
    <body>
        <div class="col" id="background"> <!--RIGHT SIDE UP COLUMN-->
            <div class="p-3 border bg-light" id="rightcolumn">

                <p class="heading">Rates</p>
                <p class="headingRoomAvailability">${roomAvailability}</p>
                <form action="bookInLysanderRateController" method="POST">

                    <div class="container2 mb-3">
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <label for="floatingInput" id="labels">Total Amount</label>
                                </div>
                            </div>
                            <div class="col">
                                <div class="form" id="textbox">
                                    <p>Calculated Total Amount ${totalAmount}</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="container2 mb-3">
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <label for="floatingInput" id="labels">Payment Amount</label>
                                </div>

                            </div>
                            <div class="col">
                                <div class="form" id="textbox">
                                    <p>calculated Amount 20% ${paymentAmount}</p>
                                </div>
                            </div>
                        </div>
                    </div>        
                    <div class="container2 mb-3">
                        <div class="row">
                            <div class="col">
                            </div>
                            <div class="col">
                                <div class="form" id="textbox">
                                    <div class="form-check">
                                        <input class="form-check-input" type="checkbox" value="TRUE" name="paymentAmount" id="flexCheckDefault">
                                        <label class="form-check-label" for="flexCheckDefault">
                                            <b>CLICK HERE TO PAY THE FULL AMOUNT</b>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>  
                    <div class="d-grid gap-2 col-6 mx-auto">
                        <button type="submit" name="submitDONE" class="btn btn-secondary" id="buttons">OK</button>
                    </div><br>
                </form>
            </div>
        </div>
    </body>
</html>
