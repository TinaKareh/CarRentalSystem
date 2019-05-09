<%-- 
    Document   : register_driver
    Created on : Feb 1, 2019, 10:44:53 PM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/resources/css/index.css">

        <title>Furistics Car Rental Company</title>
    </head>
    <body>
        <div class="container">
            <fieldset>
                <legend style="font-size: 40px; margin-bottom: 50px; font-weight:600; color: #e0a800; ">New Vehicle</legend>
                <form method="POST" action=""> 
                    <div class="form-group">
                        <label for="plateNo">Plate Number</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="plateNo" class="form-control"  style="width: 50%;" placeholder="Plate Number" required="">
                    </div>
                    <div class="form-group">
                        <label for="make">Make</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="make" class="form-control" style="width: 50%;" placeholder="Make" required="">

                    </div>
                    <div class="form-group">
                        <label for="model">Model</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="model" class="form-control"  style="width: 50%;" placeholder="Model" required="">

                    </div>
                    <div class="form-group">
                        <label for="yearMake">Year Of Make</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="yearMake" class="form-control" style="width: 50%;" placeholder="Year Of Make" required="">

                    </div>
                    <div class="form-group">
                        <label for="vehicleColor">Color</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="vehicleColor" class="form-control" style="width: 50%;" placeholder="Color" required="">

                    </div>
                    <div class="form-group">
                        <label for="passCount">Passenger Count</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="passCount" class="form-control" style="width: 50%;" placeholder="Passenger count" required="">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-sm" style="width: 50%;">Save</button>
                    </div>
                </form>
            </fieldset>
        </div>
    </body>
</html>
