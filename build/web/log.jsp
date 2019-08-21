<%-- 
    Document   : log
    Created on : Jul 29, 2019, 12:52:40 PM
    Author     : h
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
            <h1>yogendra</h1>
    <body>
           <%
               
               String name = request.getParameter("uname");
               String pass = request.getParameter("pass");
               
               String username="";
               String password="";
               
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store","root","root");
                   Statement st = con.createStatement();
                   ResultSet rs = st.executeQuery("select * from login");
                   while(rs.next())
                   {
                        
                        username = rs.getString("username");
                        password = rs.getString("password");
                      
                   }  
                    
                   
                   if(name.equals(username) && pass.equals(password))
                        {
                            out.print("Login Successfully");
                        }
                        else
                        {
                            out.print("Invalid username or password");
                        }        
               
               
               }catch(Exception e)
               {
               }
           %>     
    </body>
</html>

