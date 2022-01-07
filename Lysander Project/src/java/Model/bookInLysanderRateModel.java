
package Model;

public class bookInLysanderRateModel {
    private String totalAmount;
    private String paymentAmount;
    
    public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount; }
    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }
    
    public String getTotalAmount() { return this.totalAmount; }
    public String getPaymentAmount() { return this.paymentAmount; }
    
    //creating the object to bookInLysanderCalculationModel
    bookInLysanderCalculationModel bookLysanderCalculationobj = new bookInLysanderCalculationModel();
    boolean totalAmountSuccess = bookLysanderCalculationobj.calculateTotalAmount();
    boolean paymentAmountSuccess = bookLysanderCalculationobj.calculatePaymentAmount();
    
    //function to check if the user likes to pay the full amount
    public void checkPaymentAmount(String data) 
    {
        if(data == "TRUE")
        {
            setPaymentAmount(totalAmount);
        }
    }
}
