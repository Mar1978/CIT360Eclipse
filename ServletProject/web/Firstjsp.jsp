<%-- 
    Document   : Firstjsp
    Created on : May 21, 2018, 10:21:11 PM
    Author     : mikeg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println("<h1>Hey, How are you doing (JSP)?</h1>");
            %>
            
            <a href="FirstServlet">Click here for Servlet</a>
    </body>
</html>
