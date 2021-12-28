/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
/**
 *
 * @author Sandaru Jayathilaka
 */
public class dbConModel {
    
    public Connection createConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellysander","root","");
                return con;
    }
     public  boolean checkLogin(String email,String nic) 
                {
                  boolean st =false;
                  try {

                      
                      PreparedStatement ps = createConnection().prepareStatement("select * from guest where guest_Email=? and guest_NIC=?");
                      ps.setString(1, email);
                      ps.setString(2, nic);
                      ResultSet rs =ps.executeQuery();
                      st = rs.next();

                  }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
        
                     return st;   
    
               }
}
