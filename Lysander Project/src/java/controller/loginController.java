
package controller;

import Model.dbConModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginController", urlPatterns = {"/loginController"})
public class loginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    //checked
    //public boolean logInfo;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    // need  to add sdk
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //apply form inputs in to a getter
        String email = request.getParameter("guest_Email");
        String nic = request.getParameter("guest_Name");
        
        //check matching status of email and nic
        try{
            dbConModel con = new dbConModel();
            boolean match = con.checkLogin(email,nic);
            if(match==true)
            {
                out.println("You have successfully logged!!!");
                RequestDispatcher lrd = request.getRequestDispatcher("HomePage.jsp");
                lrd.forward(request, response);
                //logInfo=true;
            }else
            {
                out.println("Email and NIC is not matching");
            }
        }catch(Exception se) {
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
    //review added
}
