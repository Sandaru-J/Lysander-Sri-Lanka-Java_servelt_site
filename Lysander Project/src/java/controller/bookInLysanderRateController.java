package controller;

import Model.bookInLysanderCalculationModel;
import Model.bookInLysanderModel;
import Model.bookInLysanderRateModel;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.TRUE;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bookInLysanderRateController", urlPatterns = {"/bookInLysanderRateController"})
public class bookInLysanderRateController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //variable to take the payment values
        String totalAmount, paymentAmount, roomAvailability="NULL";
        
        //take the object from the bookInLysanderRateMdel
        bookInLysanderRateModel bookLysanderRateobj = new bookInLysanderRateModel();
        
        //check the totalAmount, paymentAmount and setAttribute to show the details
        if(bookLysanderRateobj.totalAmountSuccess == TRUE){
            bookLysanderRateobj.checkTotalAmount();
            totalAmount = bookLysanderRateobj.getTotalAmount();
        } else {
            totalAmount = "0";
        }
        
        if(bookLysanderRateobj.paymentAmountSuccess == TRUE){
            bookLysanderRateobj.checkPaymentAmount();
            paymentAmount = bookLysanderRateobj.getPaymentAmount();
        } else {
            paymentAmount = "0";
        }
        
        //check the Availability of the roooms from database functino TRUE FALSE
        //via if else
        
        //print the payment values in the jsp file
        request.setAttribute("totalAmount", totalAmount);
        request.setAttribute("paymentAmount", paymentAmount);
        request.setAttribute("roomAvailability", roomAvailability);
        
        
        //requests from bookInLysanderRates.jsp to pay full amount
        String paymentAmountCheckBox = request.getParameter("paymentAmount");
        
        //object and setters to pass the data to **bookInLysanderRateModel**
        bookLysanderRateobj.checkPaymentAmount(paymentAmountCheckBox);
        
        //Change the forward path when submit button clicks
        String PATH;
        String submitDone = request.getParameter("submitDone");
        if(submitDone == ""){
            PATH = "bookInLysanderRateController";
        } else {
            PATH = "bookInLysanderRate.jsp";
        }
        RequestDispatcher reqDispatcherobj = request.getRequestDispatcher(PATH);
        reqDispatcherobj.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
