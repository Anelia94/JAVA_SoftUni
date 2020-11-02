import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Comparator<Integer> comparator = (a, b) -> {
            int num = a.compareTo(b);
            if (a % 2 == 0 && b % 2 !=0) {
                num = -1;
            } else if (a %2 != 0 && b % 2 == 0) {
                num = 1;
            }
            return num;
        };

        list.stream().sorted(comparator).forEach(e -> System.out.print(e+ " "));
    }
}
