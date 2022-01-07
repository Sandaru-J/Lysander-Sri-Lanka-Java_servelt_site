/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sandaru Jayathilaka
 */
public class dbConModel {
    public Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "");
       Statement st=con.createStatement();
//             System.out.println("connection established successfully...!!");
        return con;
    }
    
    public  boolean checkLogin(String guest_Email,String guest_NIC) 
                {
                  boolean st =false;
                  try {

                      
                      PreparedStatement ps = createConnection().prepareStatement("select * from guest where guest_Email=? and guest_NIC=?");
                      ps.setString(1, guest_Email);
                      ps.setString(2, guest_NIC);
                      ResultSet rs =ps.executeQuery();
                      st = rs.next();

                  }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
        
                     return st;   
    
               }
    
    public  boolean regUser(String guest_FName, String guest_LName, String guest_Email,String guest_NIC,String guest_Country,String guest_Phone) throws ClassNotFoundException, SQLException 
                {
                    PreparedStatement ps = createConnection().prepareStatement("insert into guest values(?,?,?,?,?,?)");
                    
                    ps.setString(1, guest_FName);
                    ps.setString(2, guest_LName);
                    ps.setString(3, guest_Email);
                    ps.setString(4, guest_Country);
                    ps.setString(5, guest_NIC);
                    ps.setString(6, guest_Phone);
                    int i = ps.executeUpdate();

                   if(i > 0) 
                        return true;
                      else
                        return false;                   
                    
                }
}
