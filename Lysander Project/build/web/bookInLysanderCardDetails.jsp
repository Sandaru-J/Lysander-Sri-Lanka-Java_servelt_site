<%-- 
    Document   : bookInLysanderCardDetails
    Created on : Jan 7, 2022, 3:03:44 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <!--  jQuery -->
        <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
        <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
        <!-- Bootstrap Date-Picker Plugin -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
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
        <div class="p-3 border bg-light" id="rightcolumn">

            <p class="heading">Credit Card Details</p>
            <form action="bookInLysanderCardDetailsController" method="POST">
                <div class="form-floating mb-3">
                    <input type="card_number" class="form-control" id="floatingInput" name="cardNumber" placeholder="Card Number">
                    <label for="floatingInput">Card Number</label>
                </div> 
                <div class="form-floating mb-3">
                    <input type="card_holders_name" class="form-control" id="floatingInput" name="cardHoldersName" placeholder="Card Holders Name">
                    <label for="floatingInput">Card Holder's Name</label>
                </div>
                <div class="container2 mb-3">
                    <div class="row">
                        <label for="floatingInput">Expire Date</label>
                        <div class="col">
                            <div class="row">
                                <div class="col">
                                    <select class="form-select" name="cardExpireMonth" aria-label="Default select example">
                                        <option selected>Month</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                    </select>
                                </div>
                                <div class="col">
                                    <select class="form-select" name="cardExpireYear" aria-label="Default select example">
                                        <option selected>Year</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form">
                                <input type="cvv" class="form-control" name="cardCVV" id="floatingInput" placeholder="CVV">
                            </div>
                        </div>
                    </div>
                </div>
                <br>
                <div class="d-grid gap-2 col-6 mx-auto">
                    <button type="submit" class="btn btn-secondary" id="buttons">Reserve</button>
                </div>
            </form>
        </div>
    </body>
</html>

