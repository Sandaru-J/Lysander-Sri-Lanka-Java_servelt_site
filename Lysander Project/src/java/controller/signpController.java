/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.dbConModel;
/**
 *
 * @author Sandaru Jayathilaka
 */
public class signpController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signpController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signpController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
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
                    RequestDispatcher rs = request.getRequestDispatcher("SignUpSuccess.html");
                        rs.include(request, response);
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
