<%-- 
    Document   : Renting-car
    Created on : Feb 1, 2019, 11:17:43 AM
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
            <div style="float: left;">
                <img src="${pageContext.request.contextPath}/resources/nakuru.jpg" style="height: 500%;  width:280%;" alt="rent">

            </div>
            <div class="container-fluid" style="float: right;">
                <fieldset>
                    <legend style="font-size: 40px; font-weight: 600; margin-bottom:50px; color: #e0a800; ">Get Started</legend>

                    <form method="POST" action="">
                        <div class="form-group">
                            <label for="county">County</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="county" style="width: 130%;"  class="form-control" placeholder="County" required="">
                        </div>
                        <div class="form-group">
                            <label for="district">District</label><span style="color: #e0a800;">*</span><br> 
                            <input type="text" id="district"  style="width: 130%;" class="form-control" placeholder="District" required="">
                        </div>
                         <div class="form-group">
                            <label for="passCount">Passenger Count</label><span style="color: #e0a800;">*</span><br> 
                            <input type="text" id="passCount"  style="width: 130%;" class="form-control" placeholder="Passenger Count" required="">
                        </div>
                        <div class="form-group">
                            <label for="pickUp">Pick Up Location</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="pickUp"  style="width: 130%;" class="form-control" placeholder=" PickUp Location" required="">
                        </div>
                        <div class="form-group">
                            <div style="float: left;">
                                <label for="pickDate">Pick Up Date</label><span style="color: #e0a800;">>*</span><br>
                                <input type="date" id="pickDate"   class="form-control" placeholder=" PickUp Date" required=""> 
                            </div>
                            <div style="float: right">
                                <label for="pickTime">Pick Up Time</label><span style="color: #e0a800;">*</span><br>
                                <input type="time" id="pickTime"   class="form-control" placeholder="PickUp Time" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label> Drop Off Location</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="dropOff" style="width: 130%;" class="form-control" placeholder="Drop Location" required="">
                        </div>
                        <div class="form-group">
                            <div style="float: left;">
                                <label for="dropDate">Drop Off Date</label><span style="color: #e0a800;">*</span><br>
                                <input type="date" id="dropDate" class="form-control" placeholder="Drop Off Date" required=""> 
                            </div>

                            <div style="float: right;">
                                <label for="dropTime">Drop Off Time</label><span style="color: #e0a800;">*</span><br>
                                <input type="time" id="dropTime" class="form-control" placeholder="Drop Off Time" required="">  
                            </div>
                        </div>
                        <div class="form-group">
                            <h1 style="font-size: 15px; font-weight: 600;">Have a reservation?</h1><br>
                            <div style="float:left;">
                            
                            <button class="btn btn-primary btn-sm" type="submit" style="width: 150%;">Modify</button>
                            </div>
                            <div style="float: right;">
                            <button class="btn btn-primary btn-sm" type="submit" style=" width: 150%;" >Cancel</button>
                            </div>
                        </div>
                    </form>

                </fieldset>
            </div>
        </div>
    </body>
</html>
