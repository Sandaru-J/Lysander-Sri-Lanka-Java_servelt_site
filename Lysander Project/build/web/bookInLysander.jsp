<%-- 
    Document   : bookInLysander
    Created on : Jan 7, 2022, 1:16:26 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : bookInLysander
    Created on : Jan 5, 2022, 3:04:43 AM
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
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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

        <div class="col" id="background"> <!--LEFT SIDE COLUMN-->
            <div class="p-3 border bg-light" id="leftcolumn">

                <br><br><p class="heading" id="booking">BOOK-IN LYSANDER</p><br>

                <form action="bookInLysanderController" method="POST">

                    <div class="form-group mb-3">
                        <label for="exampleFormControlInput1" id="label_name">Username</label>
                        <input class="form-control" type="text" value="<% out.println("UserName Took From The SESSION"); %>" aria-label="readonly input example" readonly>
                    </div>
                    <div class="form-floating mb-3">

                        <input type="text" class="form-control" name="region" id="floatingInput" placeholder="Region">
                        <label for="floatingInput">Region</label>
                    </div>

                    <div class="form-group mb-3">      
                        <div class="container1">

                            <div class="row align-items-start">
                                <div class="col">
                                    <label class="control-label" for="date">Check-In</label>
                                    <input class="form-control" id="date" name="date" placeholder="Check-In" type="text"/>
                                </div>
                                <div class="col">
                                    <label class="control-label" for="date">Check-Out  </label>
                                    <input class="form-control" id="date" name="date" placeholder="Check-Out" type="text"/>
                                </div>

                            </div>
                        </div><br>
                        <div class="form-group mb-3">
                            <label class="control-label" for="date">Room Type</label>
                            <select class="form-select" name="roomType" aria-label="Default select example">
                                <option selected></option>
                                <option value="1">Single Room</option>
                                <option value="2">Double Room</option>
                                <option value="3">Tripple Room</option>
                            </select>
                        </div>
                        <div class="container2">
                            <div class="row">
                                <div class="col">
                                    <label class="control-label" for="date">Rooms</label>
                                    <select class="form-select" name="roomsCount" aria-label="Default select example">
                                        <option selected></option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="1">4</option>
                                        <option value="2">5</option>
                                        <option value="3">6</option>
                                        <option value="1">7</option>
                                        <option value="2">8</option>
                                        <option value="3">9</option>
                                        <option value="3">10</option>
                                    </select>
                                </div>
                                <div class="col">
                                    <div class="row">
                                        <div class="col">
                                            <label class="control-label" for="date">Adults</label>
                                            <select class="form-select" name="adultsCount" aria-label="Default select example">
                                                <option selected></option>
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>
                                        </div>
                                        <div class="col">
                                            <label class="control-label" for="date">Kids</label>
                                            <select class="form-select" name="kidsCount" aria-label="Default select example">
                                                <option selected></option>
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="form-group mb-3">
                        <label class="control-label" for="date">Package</label>
                        <select class="form-select" name="packages" aria-label="Default select example">
                            <option selected></option>
                            <option value="1">FB</option>
                            <option value="2">HB</option>
                            <option value="3">BB</option>
                            <option value="3">RO</option>
                        </select>
                    </div>
                    <br>
                    <div class="d-grid gap-2 col-6 mx-auto">
                        <button type="submit" class="btn btn-secondary" id="buttons">SUBMIT</button>

                    </div>
                    <br><br><br>
                </form>
            </div>
        </div>


        <script>
            $(document).ready(function () {
                var date_input = $('input[name="date"]');
                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                var options = {
                    format: 'mm/dd/yyyy',
                    container: container,
                    todayHighlight: true,
                    autoclose: true,
                };
                date_input.datepicker(options);
            })
        </script>  
    </body>
</html>


