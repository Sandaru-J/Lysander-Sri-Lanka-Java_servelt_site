package controller;

import Model.signUpModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "signpController", urlPatterns = {"/signpController"})
public class signpController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        String FName = request.getParameter("guestFName");
        String LName = request.getParameter("guestLName");
        String Email = request.getParameter("guestEmail");
        String Country = request.getParameter("guestCountry");
        String Nic = request.getParameter("guestNic");
        int PhoneNumber = Integer.parseInt(request.getParameter("guestPhoneNumber"));

        signUpModel signUpModelobj = new signUpModel();

        signUpModelobj.setguestFName(FName);
        signUpModelobj.setguestLName(LName);
        signUpModelobj.setguestEmail(Email);
        signUpModelobj.setguestCountry(Country);
        signUpModelobj.setguestNic(Nic);
        signUpModelobj.setguestPhoneNumber(PhoneNumber);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
