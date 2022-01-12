
package Model;

import static java.lang.Boolean.TRUE;

public class bookInLysanderRateModel {
    private String totalAmount;
    private String paymentAmount;
    
    //getters and setters in bookInLysanderRate 
    public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount; }
    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }
    
    public String getTotalAmount() { return this.totalAmount; }
    public String getPaymentAmount() { return this.paymentAmount; }
    
    
   
    
    //creating the object to bookInLysanderCalculationModel
    bookInLysanderCalculationModel bookLysanderCalculationobj = new bookInLysanderCalculationModel();
    public boolean totalAmountSuccess = bookLysanderCalculationobj.calculateTotalAmount();
    public boolean paymentAmountSuccess = bookLysanderCalculationobj.calculatePaymentAmount();
    
    public void checkTotalAmount(){
        setTotalAmount(bookLysanderCalculationobj.paymentAmount);
    }
    
    public void checkPaymentAmount(){
        setPaymentAmount(bookLysanderCalculationobj.totalAmount);
    }
    
    //function to check if the user likes to pay the full amount
    public void checkPaymentAmount(String data) 
    {
        if(data == "TRUE")
        {
            setPaymentAmount(totalAmount);
        }
    }
}
