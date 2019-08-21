<%-- 
    Document   : regis
    Created on : Jul 29, 2019, 10:05:30 PM
    Author     : h
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
             String name = request.getParameter("uname");
             String pass = request.getParameter("pass");
             String mob = request.getParameter("mob");
             String add = request.getParameter("add");
               
            
               
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store","root","root");
                   Statement st = con.createStatement();
                   st.executeUpdate("insert into login (username,password,mobile,address)values('"+name+"','"+pass+"','"+mob+"','"+add+"')");
                   
                 
                    response.sendRedirect("alert.jsp");
                    
                    
                }catch (Exception e)
                           {
                           
                           }
                   
        
        %>
         
    </body>
</html>
