
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

@WebServlet(name = "bookInLysanderController", urlPatterns = {"/bookInLysanderController"})
public class bookInLysanderController extends HttpServlet {

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
        //requests from the bookInLysander.jsp
        String region = request.getParameter("region");
        String checkInDate = request.getParameter("date");
        String checkOutDate = request.getParameter("date");
        String roomType = request.getParameter("roomType");
        String roomsCount = request.getParameter("roomsCount");
        String adultsCount = request.getParameter("adultsCount");
        String kidsCount = request.getParameter("kidsCount");
        String packages = request.getParameter("packages");
        
        //object and setters to pass the data to **bookInLysanderModel**
        bookInLysanderModel bookLysanderobj = new bookInLysanderModel();
        bookLysanderobj.setRegion(region);
        bookLysanderobj.setCheckInDate(checkInDate);
        bookLysanderobj.setCheckOutDate(checkOutDate);
        bookLysanderobj.setRoomType(roomType);
        bookLysanderobj.setRoomsCount(roomsCount);
        bookLysanderobj.setAdultsCount(adultsCount);
        bookLysanderobj.setKidsCount(kidsCount);
        bookLysanderobj.setPackages(packages);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
