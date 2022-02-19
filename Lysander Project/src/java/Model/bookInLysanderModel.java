
package Model;

public class bookInLysanderModel {
    private String region;
    private String checkInDate;
    private String checkOutDate;
    private String roomType;
    private String roomsCount;
    private String adultsCount;
    private String kidsCount;
    private String packages;
    private String pack;

    public void setRegion(String region) { this.region = region; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public void setRoomsCount(String roomsCount) { this.roomsCount = roomsCount; }
    public void setAdultsCount(String adultsCount) { this.adultsCount = adultsCount; }
    public void setKidsCount(String kidsCount) { this.kidsCount = kidsCount; }
    public void setPackages(String packages) { this.packages = packages; }
    
    public String getRegion() { return this.region; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return this.checkOutDate; }
    public String getRoomType() { return this.roomType; }
    public String getRoomCount() { return this.roomsCount; }
    public String getAdultsCount() { return this.adultsCount; }
    public String getKidsCount() { return this.kidsCount; }
    public String getPackages() { return this.packages; }
}
