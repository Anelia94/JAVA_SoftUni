package Hotel_Reservation;

public class PriceCalculator {
    //“<pricePerDay> <numberOfDays> <season> <discountType>
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double priceCalculate() {
        return (((this.pricePerDay * this.numberOfDays) * this.season.getMultiplier()) * (1.00 - this.discountType.getDiscountInPercent() / 100.00));
    }
}
