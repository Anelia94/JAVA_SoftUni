package Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Card Ranks:");
        for (Rank rank : Rank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",rank.ordinal(),rank.name());
        }
    }
}
