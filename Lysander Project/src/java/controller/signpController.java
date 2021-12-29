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
        
        //Taking the data from the form
        String FName = request.getParameter("guestFName");
        String LName = request.getParameter("guestLName");
        String Email = request.getParameter("guestEmail");
        String Country = request.getParameter("guestCountry");
        String Nic = request.getParameter("guestNic");
        int PhoneNumber = Integer.parseInt(request.getParameter("guestPhoneNumber"));

        
        //check if the data is empty
        if(FName.isEmpty() || LName.isEmpty() || Email.isEmpty() || Country.isEmpty() || Nic.isEmpty()) {
            response.sendRedirect("http://localhost:8080/Lysander_Project/SignUpPage.html");
        } else {
            //creating the object for signUpModel class
            signUpModel signUpModelobj = new signUpModel();

            //Passing the data into the signUpModel clas using getters and setters
            signUpModelobj.setguestFName(FName);
            signUpModelobj.setguestLName(LName);
            signUpModelobj.setguestEmail(Email);
            signUpModelobj.setguestCountry(Country);
            signUpModelobj.setguestNic(Nic);
            signUpModelobj.setguestPhoneNumber(PhoneNumber);
            
            //validate function
            if(signUpModelobj.InputValidate()) {
                if(signUpModelobj.databaseSignUpDataInput()) {
                    //redirect to successfully sign up
                } else {
                    //redirect to error page
                }
            } else {
                response.sendRedirect("http://localhost:8080/Lysander_Project/SignUpPage.html");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
