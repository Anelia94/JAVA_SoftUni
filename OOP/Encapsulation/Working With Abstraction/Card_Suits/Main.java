package Card_Suits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Card Suits:");
        for (Suit suit : Suit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(),suit.name());
        }
    }
}
