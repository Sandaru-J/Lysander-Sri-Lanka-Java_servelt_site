
package Model;

import java.sql.*;

public class dbConModel {

    public Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        return con;
    }

    public boolean checkLogin(String guest_Email, String guest_Name) {
        boolean st = false;
        try {

            PreparedStatement ps = createConnection().prepareStatement("select * from guest where guest_Email=? and guest_Name=?");
            ps.setString(1, guest_Email);
            ps.setString(2, guest_Name);
            ResultSet rs = ps.executeQuery();
            st = rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return st;

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
