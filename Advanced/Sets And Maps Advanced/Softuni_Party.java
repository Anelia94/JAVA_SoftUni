import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Softuni_Party{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> guests = new TreeSet<>();
        while (!"PARTY".equals(input)) {
            guests.add(input);

            input = scanner.nextLine();
        }

        while (!"END".equals(input)) {
            guests.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}

