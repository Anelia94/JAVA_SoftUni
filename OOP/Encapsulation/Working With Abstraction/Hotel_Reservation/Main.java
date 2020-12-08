package Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        //“<pricePerDay> <numberOfDays> <season> <discountType>
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2].toUpperCase());
        DiscountType discount = DiscountType.valueOf(input[3].toUpperCase());

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discount);
        double price = priceCalculator.priceCalculate();
        System.out.printf("%.2f",price);

    }
}
