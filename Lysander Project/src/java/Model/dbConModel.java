/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sandaru Jayathilaka
 */
public class dbConModel {
    public Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
         Statement st=con.createStatement();
             System.out.println("connection established successfully...!!");
        return con;
    }
    
    public  boolean regUser(String fName, String lName, String email,String country,String Nic,String Pno) throws ClassNotFoundException, SQLException 
                {
                    PreparedStatement ps = createConnection().prepareStatement("insert into guest values(?,?,?,?,?,?)");
                    ps.setString(1, fName);
                    ps.setString(2, lName);
                    ps.setString(3, email);
                    ps.setString(4, country);
                    ps.setString(5, Nic);
                    ps.setString(6, Pno);
                    int i = ps.executeUpdate();

                   if(i > 0) 
                        return true;
                      else
                        return false;                   
                    
                }
}
