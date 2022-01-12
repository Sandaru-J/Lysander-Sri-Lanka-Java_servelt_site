package Model;

import static java.lang.Boolean.TRUE;

public class bookInLysanderCalculationModel {

    public String totalAmount;
    public String paymentAmount;
    
    bookInLysanderModel bookLysanderModelobj = new bookInLysanderModel();
    String region = bookLysanderModelobj.getRegion();
    String checkInDate = bookLysanderModelobj.getCheckInDate();
    String checkOutDate = bookLysanderModelobj.getCheckOutDate();
    String roomType = bookLysanderModelobj.getRoomType();
    String roomsCount = bookLysanderModelobj.getRoomCount();
    String adultsCount = bookLysanderModelobj.getAdultsCount();
    String kidsCount = bookLysanderModelobj.getKidsCount();
    String packages = bookLysanderModelobj.getPackages();

    
    public boolean calculateTotalAmount() {
        String calculatedTotalAmount = null;
        
        //calculate the total Amount
        totalAmount = calculatedTotalAmount;
        return TRUE;
    }

    //function to calculate the paymentAmount
    public boolean calculatePaymentAmount() {
        String calculatedPaymentAmount = null;
        
        //calculate the acmount for the 20%payment
        paymentAmount = calculatedPaymentAmount;
        return TRUE;
    }
}
