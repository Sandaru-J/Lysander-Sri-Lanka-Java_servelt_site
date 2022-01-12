<%-- Document : accountPage Created on : Jan 8, 2022, 1:55:27 PM Author : USER --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                crossorigin="anonymous">
            <!--  jQuery -->
            <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
            <!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
            <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />
            <!-- Bootstrap Date-Picker Plugin -->
            <script type="text/javascript"
                src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
            <link rel="stylesheet"
                href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
            <title>JSP Page</title>
            <style>
                #buttonUserAccount {
                    margin-top: 5px;
                    margin-bottom: 5px;
                }
            </style>
        </head>

        <body>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-2">
                        <p>
                            <img src="Images/man.png" class="img-thumbnail" alt="...">
                        </p>
                    </div>
                    <div class="col-4">
                        <p>
                            <h5><b>Logged User Name:</b> session.name</h5>
                            <h5><b>Logged User Email:</b> session.email</h5>
                            <h5><b>Logged User Region:</b> session.region</h5>
                        </p>
                    </div>
                    <div class="col-4">
                        <p>
                            <button type="button" id="buttonUserAccount" class="btn btn-outline-danger">LOG OUT</button> <br>
                            <button type="button" id="buttonUserAccount" class="btn btn-outline-secondary">Cancel Room Order</button> <br>
                            <button type="button" id="buttonUserAccount" class="btn btn-outline-secondary">Change Room Order</button>
                        </p>
                    </div>
                </div>
            </div>
        </body>

        </html>