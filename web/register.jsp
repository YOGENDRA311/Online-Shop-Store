<%-- 
    Document   : register
    Created on : Jul 29, 2019, 9:41:56 PM
    Author     : h
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER</title>
          <link rel="stylesheet" href="style1.css">
        <link rel="stylesheet" href="style1.css" type="text/css"/>
    </head>
    <body>
       <div class="loginbox">
            <img src="man.png" class="user">
            <h2> SIGN UP HERE </h2>
            <form action="regis.jsp">
                <p>Email</p>
                <input type="text" name="uname" placeholder="Enter Email">
                <p>Password</p>
                <input type="password" name="pass" placeholder="Enter Password"> 
                <p>Mobile_No</p>
                <input type="text" name="mob" placeholder="Enter mobile number">
                <p>Address</p>
                <input type="text" name="add" placeholder="Enter Address">
                 <input type="submit" name="" value="sign Up"></form>
                 <a href="index.jsp">Already Have An Account?</a>
                 
                
    </body>
</html>
