package Model;

import java.util.regex.Pattern;

public class signUpModel {
    
    //Declaring the variables
    private String guestFName;
    private String guestLName;
    private String guestEmail;
    private String guestCountry;
    private String guestNic;
    private int guestPhoneNumber;
    
    //declaring setters
    public void setguestFName(String setFName) { this.guestFName = setFName; }
    public void setguestLName(String setLName) { this.guestLName = setLName; }
    public void setguestEmail(String setEmail) { this.guestEmail = setEmail; }
public void setguestCountry(String setCountry) { this.guestCountry = setCountry; }
    public void setguestNic(String setNic) { this.guestNic = setNic; }
    public void setguestPhoneNumber(int setPhoneNumber) { this.guestPhoneNumber = setPhoneNumber; }
    
    //declare getters
    public String getguestFName(){ return guestFName; }
    public String getguestLName(){ return guestLName; }
    public String getguestEmail(){ return guestEmail; }
    public String getguestCountry(){ return guestCountry; }
    public String getguestNic(){ return guestNic; }
    public int getguestPhoneNumber() { return guestPhoneNumber; }
    
    //check the data given to the models is correct
    public boolean InputValidate() {
        if((Pattern.matches("[a-zA-Z]", guestFName)) && Pattern.matches("[a-z/A-Z]", guestLName) && Pattern.matches("[a-z/A-z]", guestCountry) && 
                Pattern.matches("[[a-z/A-Z]&&[0-9]]", guestNic)){
            return true;
        } else {
            return false;
        }
    }
    
    //function to insert the data into the database
    public boolean databaseSignUpDataInput() {
        return true;
    }
}
