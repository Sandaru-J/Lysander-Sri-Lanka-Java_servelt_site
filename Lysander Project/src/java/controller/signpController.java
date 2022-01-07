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
import javax.persistence.Id;
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
//        String guest_Id = request.getParameter("guest_Id");
        String guest_FName = request.getParameter("guest_FName");
        String guest_LName = request.getParameter("guest_LName");
        String guest_Email = request.getParameter("guest_Email");
        String guest_Country = request.getParameter("guest_Country");
        String guest_NIC = request.getParameter("guest_NIC");
        String guest_Phone = request.getParameter("guest_Phone");

        try {
               dbConModel con=new dbConModel();
               boolean match=con.regUser(guest_FName,guest_LName,guest_Email,guest_Country,guest_NIC,guest_Phone);
               if(match==true){
                    out.println("You have successfully registered!!!");
               }               
                else
               {
                   out.println("Your registration failed");
//                    RequestDispatcher rs = request.getRequestDispatcher("Error.html");
//                        rs.include(request, response);
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
