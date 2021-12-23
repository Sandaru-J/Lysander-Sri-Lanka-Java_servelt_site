
package Controllers;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseCountryController extends HttpServlet {
    
    public String Country = "Choose Your Country Here";
    String destination = "HomePage.jsp";
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        //Taking the country chosen by the user     
        Country = req.getParameter("country");
        
        //forwarding the response to the user HomePage Header
        RequestDispatcher requestDispatcherHome = req.getRequestDispatcher(destination);
        requestDispatcherHome.forward(req, res);
    }
}


