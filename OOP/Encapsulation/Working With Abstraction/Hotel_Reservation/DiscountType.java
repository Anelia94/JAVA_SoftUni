package Hotel_Reservation;

public enum  DiscountType {
    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private int discountInPercent;
    DiscountType(int discountInPercent){
        this.discountInPercent = discountInPercent;
    }
    public int getDiscountInPercent(){
        return this.discountInPercent;
    }
}
