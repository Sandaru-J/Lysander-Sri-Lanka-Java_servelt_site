package controller;

import Mail.MailUtil;
import Model.dbConFeedback;
import Model.dbConModel;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.mail.Message;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class FeedbackController extends HttpServlet {

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
            out.println("<title>Servlet FeedbackController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FeedbackController at " + request.getContextPath() + "</h1>");
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
        String name = request.getParameter("Name");
        String email_Adress = request.getParameter("Email");
        String subject = request.getParameter("Subject");
        String message = request.getParameter("Message");
        
       MailUtil m = new MailUtil();    
       m.setmessage(message);
        
       //MailUtil.sendMail(m);
      
        
        try 
        {
               dbConFeedback con = new dbConFeedback();
               boolean rslt=con.getFeedback(name,email_Adress,subject,message);
               if(rslt==true){
                    out.println("Your Feedback has Successfully Submited!!!");
               }               
                else
               {
                   out.println("Your Feedback Submission has failed!!!");
                    RequestDispatcher rs = request.getRequestDispatcher("Error.html");
                        rs.include(request, response);
               }                
        }
        catch(Exception se) 
        {
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