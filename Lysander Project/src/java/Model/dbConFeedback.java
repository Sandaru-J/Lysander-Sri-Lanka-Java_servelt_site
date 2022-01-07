package Model;

import Mail.MailUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class dbConFeedback {
    
    public Connection createConnection() throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellysander", "root", "");
        return con;
    }
    
    public boolean getFeedback(String name, String email_Adress, String subject, String message) throws SQLException, ClassNotFoundException 
    {
        PreparedStatement ps = createConnection().prepareStatement("insert into feedback values(?,?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, email_Adress);
                    ps.setString(3, subject);
                    ps.setString(4, message);
                    int i = ps.executeUpdate();
                    
                    
                    
      

                    if(i > 0) 
                        return true;
                      else
                        return false;

    }
    


    
    
}