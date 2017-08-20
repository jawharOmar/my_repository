/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joh
 */
@WebServlet(urlPatterns = {"/controller"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Welcome to LoginController Servlet");
        User user=new User();
        user.setFirst_name("john");
        user.setLast_name("tom");
        user.setAge("23");
       RequestDispatcher dis=request.getRequestDispatcher("main.jsp");
       request.setAttribute("use",user);
       dis.forward(request, response);
       

    }

}
