
package controller;

import Model.bookInLysanderCardDetailsModel;
import Model.bookInLysanderModel;
import Model.bookInLysanderRateModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bookInLysanderCardDetailsController", urlPatterns = {"/bookInLysanderCardDetailsController"})
public class bookInLysanderCardDetailsController extends HttpServlet {

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
        String cardNumber = request.getParameter("cardNumber");
        String cardHoldersName = request.getParameter("cardHoldersName");
        String cardExpireMonth = request.getParameter("cardExpireMonth");
        String cardExpireYear = request.getParameter("cardExpireYear");
        String cardCVV = request.getParameter("cardCVV");
        
        //creating the object and pass the data
        bookInLysanderCardDetailsModel lysanderCardDetailsobj = new bookInLysanderCardDetailsModel();
        lysanderCardDetailsobj.setCardNumber(cardNumber);
        lysanderCardDetailsobj.setCardHoldersName(cardHoldersName);
        lysanderCardDetailsobj.setCardExpireMonth(cardExpireMonth);
        lysanderCardDetailsobj.setCardExpireYear(cardExpireYear);
        lysanderCardDetailsobj.setCardCVV(cardCVV);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
