package Model;

import java.sql.*;

public class dbConModel {

    public Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellysander", "root", "");
        if (con != null) {
            System.out.println("connected");
        }
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

    public boolean userSignUp(String guestFname, String guestLName, String guestPhone, String guestEmail, String guestNic, String guestCountry) throws ClassNotFoundException, SQLException {
        PreparedStatement psSignUp = createConnection().prepareStatement("insert into student values(?,?,?,?,?,?)");
        psSignUp.setString(1, guestFname);
        psSignUp.setString(2, guestLName);
        psSignUp.setString(3, guestPhone);
        psSignUp.setString(3, guestEmail);
        psSignUp.setString(4, guestNic);
        psSignUp.setString(5, guestCountry);
        int i = psSignUp.executeUpdate();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
        
}
