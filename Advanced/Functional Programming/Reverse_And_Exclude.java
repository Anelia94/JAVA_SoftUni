import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reverse_And_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());


        Collections.reverse(nums);
        Predicate<Integer> filter = num -> num % n != 0;
        nums.stream().filter(filter).forEach(num -> System.out.print(num+" "));

    }
}
