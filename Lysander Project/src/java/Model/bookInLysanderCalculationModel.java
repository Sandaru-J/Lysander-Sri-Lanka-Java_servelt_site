package Model;

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

    bookInLysanderRateModel bookLysanderRateModelobj = new bookInLysanderRateModel();
    
    public String calculateTotalAmount() {
        //calculating the amount for the selected room
        
        //sending the data to bookInLysanderRateModel
        bookLysanderRateModelobj.setTotalAmount(totalAmount);
        return "TRUE";
    }

    //function to calculate the paymentAmount
    public String calculatePaymentAmount() {
        //calculate the acmount for the 20%payment
        
        bookLysanderRateModelobj.setPaymentAmount(paymentAmount);
        return "TRUE";
    }
}
