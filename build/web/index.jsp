<%-- 
    Document   : index
    Created on : Jul 29, 2019, 1:56:02 PM
    Author     : h
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
         <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body>
         <div class="loginbox">
            <img src="man.png" class="user">
            <h2> LOG IN HERE </h2>
            <form action="log.jsp">
                <p>Email</p>
                <input type="text" name="uname" placeholder="Enter Email">
                <p>Password</p>
                <input type="password" name="pass" placeholder="Enter Password">
                <input type="submit" name="" value="sign In"></form> 
            <form action="register.jsp"><input type="submit" name="" value="sign Up"></form>
                <a href="#">Forget Password</a>
       
    </body>
</html>
