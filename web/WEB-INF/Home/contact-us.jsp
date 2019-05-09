<%-- 
    Document   : contact-us
    Created on : Feb 1, 2019, 10:02:48 AM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css" />
        
        <title>Furistics Car Rental Company</title>
    </head>
    <body>
        <div class="container">
            <h2 style="font-size: 40px;font-weight: 600; color: #e0a800" >Contact Us</h2> 
            <div class="" style="float: left;"> 

                <div>
                    <h1 style="font-size: 20px;font-weight: 600; color: #e0a800" >Contact Info</h1> 
                    <ul>
                        <li>Phone         | 905-677-4848</li>
                        <li>Toll Free     |866-467-6883</li>
                        <li>Fax           | 905-611-4111</li>
                        <li>Email Address | <a href="">customercare@furistics.ca</a></li>
                    </ul>
                </div>
            </div>
            <div  style="float: right;">
                <fieldset>
                    <legend style="font-size: 15px ;font-weight:600 ; margin-bottom:50px ; color: #e0a800; ">Complete the following form and we will get back to you</legend>
                    <h3 style="font-size: 15px; color:  #000;">"*" indicates required fields</h3>
                    <form method="POST" action="">
                        <div class="form-group" >
                            <label for="fName">First Name</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="fName" style="width: 100%" class="form-control" placeholder="First Name" required="">
                        </div>
                        <div class="form-group">
                            <label for="lName"> Last Name</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="lName" class="form-control" placeholder="Last Name" required="">
                        </div>
                        <div class="form-group">
                            <label for="email">Email Address</label><br>
                            <input type="email" id="email" class="form-control" placeholder="Email Address" >
                        </div>
                        <div class="form-group">
                            <label for="phoneNo"> Phone Number</label><span style="color: #e0a800;">*</span><br>
                            <input type="text" id="phoneNo" class="form-control" placeholder="Phone Number" required="">
                        </div>

                        <div class="form-group">
                            <label for="comments">Comments</label><span style="color: #e0a800;">*</span>
                            <textarea class="form-control" id="comments" placeholder="Comments..." required=""></textarea>
                        </div>
                        <div class="form-group" style="width: 120%; color: #007bff;">
                            <button type="submit"style="width: 80%;" class="btn btn-primary btn-sm">Send</button>
                        </div>
                    </form>
                </fieldset>
            </div>
        </div>
    </body>
</html>
