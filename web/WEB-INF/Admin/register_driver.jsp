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
                <legend style="font-size: 40px; margin-bottom: 50px; font-weight:600; color: #e0a800; ">New Driver</legend>
                <form method="POST" action=""> 
                    <div class="form-group">
                        <label for="fName">First Name</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="fName" class="form-control"  style="width: 50%;" placeholder="First Name" required="">
                    </div>
                    <div class="form-group">
                        <label for="lName">Last Name</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="lName" class="form-control" style="width: 50%;" placeholder="Last Name" required="">

                    </div>
                    <div class="form-group">
                        <label for="phoneNo">Phone Number</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="phoneNo" class="form-control"  style="width: 50%;" placeholder="Phone Number" required="">

                    </div>
                    <div class="form-group">
                        <label for="national">National ID</label><span style="color: #e0a800;">*</span>
                        <input type="text" id="national" class="form-control" style="width: 50%;" placeholder="National ID" required="">

                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-sm" style="width: 50%;">Save</button>
                    </div>
                </form>
            </fieldset>
        </div>
    </body>
</html>
