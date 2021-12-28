package Model;


public class signUpModel {
    
    //Declaring the variables
    private String FName;
    private String LName;
    private String Email;
    private String Country;
    private String Nic;
    private int PhoneNumber;
    
    //declaring setters
    public void setFName(String setFName) { this.FName = setFName; }
    public void setLName(String setLName) { this.LName = setLName; }
    public void setEmail(String setEmail) { this.Email = setEmail; }
    public void setCountry(String setCountry) { this.Country = setCountry; }
    public void setNic(String setNic) { this.Nic = setNic; }
    public void setPhoneNumber(int setPhoneNumber) { this.PhoneNumber = setPhoneNumber; }
    
    //declare getters
    public String getFName(){ return FName; }
    public String getLName(){ return LName; }
    public String getEmail(){ return Email; }
    public String getCountry(){ return Country; }
    public String getNic(){ return Nic; }
    public int getPhoneNumber() { return PhoneNumber; }
}
