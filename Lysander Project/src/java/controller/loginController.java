package controller;

import Model.dbConModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginController", urlPatterns = {"/loginController"})
public class loginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //apply form inputs in to a getter
        String email = request.getParameter("guest_Email");
        String nic = request.getParameter("guest_Name");

        //check matching status of email and nic
        try {
            dbConModel con = new dbConModel();
            boolean match = con.checkLogin(email, nic);
            if (match == true) {
                out.println("You have successfully logged!!!");
                RequestDispatcher lrd = request.getRequestDispatcher("HomePage.jsp");
                lrd.forward(request, response);
            } else {
                out.println("Email and NIC is not matching");
            }
        } catch (Exception se) {
            se.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
