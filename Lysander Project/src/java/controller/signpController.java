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
    
    String FName;
    String LName;
    String Email;
    String Country;
    String Nic;
    int PhoneNumber;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        FName = request.getParameter("FName");
        LName = request.getParameter("LName");
        Email = request.getParameter("Email");
        Country = request.getParameter("Counry");
        Nic = request.getParameter("Nic");
        PhoneNumber = Integer.parseInt(request.getParameter("PhoneNumber"));
        
        signUpModel signUpModelobj = new signUpModel();
        
        signUpModelobj.setFName(FName);
        signUpModelobj.setLName(LName);
        signUpModelobj.setEmail(Email);
        signUpModelobj.setCountry(Country);
        signUpModelobj.setNic(Nic);
        signUpModelobj.setPhoneNumber(PhoneNumber);
        
    }
}

