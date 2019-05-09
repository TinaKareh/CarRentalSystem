<%-- 
    Document   : index
    Created on : Jan 31, 2019, 11:20:54 AM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css" />
        <script src="/resources/js/jquery.min.js"></script>
        <script src="/resources/css/bootstrap/bootstrap.min.js"></script>
        <title>Furistics Car Rental Company </title>
    </head>
    <body>

        <div class="container">
            <div style="float: left;"  >
                <img src="${pageContext.request.contextPath}/resources/ford2.jpg" style="height: 100%; width: 250%;" alt="home">
            </div>
            <div  style="float: right;">
                <fieldset>
                    <legend style="margin-bottom: 40px; font-size: 30px; font-weight: 600; color: #e0a800;">Log In</legend>
                    <form method="POST" action="">
                        <div class="form-group">
                            <label for="email">Email Address</label><span style="color: #e0a800;">*</span></br>
                            <input type="email" id="email" style="width: 120%;" class="form-control" placeholder="Enter Email Address" required="">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label><span style="color: #e0a800;">*</span></br>
                            <input type="password" style="width: 120%;" id="password"  class="form-control"placeholder="Enter Password" required="">
                        </div>
                        <div class="form-group" >
                            <button type="submit"style="width: 120%;" class="btn btn-primary btn-sm">Log In</button>
                        </div>
                    </form>
                    </legend>
                </fieldset>
                <div style="float: right; ">
                    <h1 style="font-size: 16px; color: #e0a800;"> need an account? register here!</h1>
                    <button type="submit" style="width: 120%;" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#new_registration_modal"> Register</button>
                    <div class="modal fade" id="new_registration_modal" tabindex="-1" role="dialog" 
                         aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered" role="document">
                            <div class="modal-content">
                                <form method="POST" action="/register/user" style="display: relative;">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                        <h2 class="modal-title" id="exampleModelLongTitle">Registration</h2>
                                    </div>
                                    <div class="modal-body">
                                        <div class="container-fluid">
                                            <div class="form-group">
                                                <label class="control-label" for="fName">First Name</label><span style="color: #e0a800;">*</span><br>
                                                <input type="text" class="form-control" id="fName" placeholder="First Name" required="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label" for="lName">Last Name</label><span style="color: #e0a800;">*</span><br>
                                                <input  type="text" class="form-control" id="lName" placeholder="Last Name" required="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label" for="email">Email Address</label><span style="color: #e0a800;">*</span><br>
                                                <input type="email" class="form-control" id="email" placeholder="Email Address" required="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label" for="phoneNo">Phone Number</label><span style="color: #e0a800;">*</span><br>
                                                <input type="text" class="form-control" id="phoneNo" placeholder="Phone Number" required="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label" for="password">Password</label><span style="color: #e0a800;">*</span><br>
                                                <input type="password" class="form-control" id="password" placeholder="Password" required="">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label" for="confirmPass">Confirm Password</label><span style="color: #e0a800;">*</span><br>
                                                <input type="password" class="form-control" id="confirmPass" placeholder="Re-enter Password" required="">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal-footer">
                                        <button class="btn btn-primary" name="submit" type="submit">Submit</button>
                                    </div>
                                </form>  
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
    </body>
</html>
