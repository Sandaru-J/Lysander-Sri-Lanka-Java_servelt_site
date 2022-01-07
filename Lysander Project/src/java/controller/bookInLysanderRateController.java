
package controller;

import Model.bookInLysanderModel;
import Model.bookInLysanderRateModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bookInLysanderRateController", urlPatterns = {"/bookInLysanderRateController"})
public class bookInLysanderRateController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
     
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        //requests from bookInLysanderRates.jsp
        String paymentAmount = request.getParameter("paymentAmount");
        
        //object and setters to pass the data to **bookInLysanderRateModel**
        bookInLysanderRateModel lysanderRateModelobj = new bookInLysanderRateModel();
        lysanderRateModelobj.checkPaymentAmount(paymentAmount);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
