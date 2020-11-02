import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Function<List<Integer>, Integer> function = l -> {
            Integer min = Collections.min(l);
            return l.lastIndexOf(min);
        };

        System.out.println(function.apply(list));
    }
}
