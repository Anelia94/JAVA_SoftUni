import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> registrations = new LinkedHashSet<>();
        while (!"END".equals(input)) {
            String command = input.split(", ")[0];
            String carNumber = input.split(", ")[1];

            switch (command) {
                case "IN":
                    registrations.add(carNumber);
                    break;
                case "OUT":
                    registrations.remove(carNumber);
                    break;
            }

            input = scanner.nextLine();
        }

        if (registrations.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), registrations));
        }
    }
}