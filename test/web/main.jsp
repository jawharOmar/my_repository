
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("token")==null)response.sendRedirect("index.jsp");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h3>Welcome to main page you are successfully Authorized </h3>
        <br>
        <br>
        <a href="logout.jsp">logout</a>
        
    </body>
</html>
