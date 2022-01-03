package controller;

//import Model.signUpModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.dbConModel;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;

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
        String PhoneNumber = request.getParameter("guestPhoneNumber");

        try {
               dbConModel con=new dbConModel();
               boolean rslt=con.regUser(FName,LName,Email,Country,Nic,PhoneNumber);
               if(rslt==true){
                    out.println("You have successfully registered!!!");
               }               
                else
               {
                   out.println("Your registration failed");
                    RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                        rs.include(request, response);
               }                
           }
        catch(Exception se) {
            se.printStackTrace();
    }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
