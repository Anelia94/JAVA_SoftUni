import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_For_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> predicate = name -> name.length() <= n;

        String[] names = scanner.nextLine().split("\\s+");
        Arrays.stream(names).filter(predicate).forEach(System.out::println);
    }
}
