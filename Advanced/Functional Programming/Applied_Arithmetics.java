import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Applied_Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        Function<int[], int[]> add = ints -> Arrays.stream(ints).map(e -> e+=1).toArray();
        Function<int[], int[]> multiply = ints -> Arrays.stream(ints).map(e -> e*=2).toArray();
        Function<int[], int[]> subtract = ints -> Arrays.stream(ints).map(e -> e-=1).toArray();
        Consumer<int[]> print = ints -> Arrays.stream(ints).forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("add")) {
                nums = add.apply(nums);
            } else if (command.equals("multiply")) {
                nums =multiply.apply(nums);
            } else if (command.equals("subtract")) {
                nums = subtract.apply(nums);
            } else if (command.equals("print")) {
                print.accept(nums);
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
