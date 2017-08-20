<%@page import="java.util.logging.Logger"%>
<%@page import="com.openkm.ws.DatabaseException_Exception"%>
<%@page import="java.util.logging.Level"%>
<%@page import="okm_auth.get_auth"%>
<%@page import="com.openkm.ws.RepositoryException_Exception"%>
<%@page import="com.openkm.ws.AccessDeniedException_Exception"%>
<%@page import="okm_auth.okm_auth"%>
<%

    String error = null;
    String token = null;
    if (request.getParameter("user_name") != null
            && request.getParameter("password") != null
            && !request.getParameter("user_name").equals("")
            && !request.getParameter("password").equals("")) {
        okm_auth okm_a = new okm_auth();
        String user = request.getParameter("user_name");
        String password = request.getParameter("password");
        okm_auth okm_auth = new okm_auth();
        try {
            token = okm_auth.login(user, password);
          session.setAttribute("token",token);
          response.sendRedirect("main.jsp");
            
        } catch (Exception e) {
            error = "login failed to the server";
        }

    } else {
        error = "please  make sure username and password is right";
    }
%>
<!DOCTYPE>
<html>
    <head>

    </head>
    <body>

        <%if (error != null) {
        %>
        <br>
        <h4><%=error%></h4>
        <a href="index.jsp">login</a>
        <%}%>
    </body>
</html>