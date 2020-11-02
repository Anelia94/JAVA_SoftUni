import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> smallestNum = array ->{
            int num = array[0];
            for (Integer integer : array) {
                if (integer < num){
                    num = integer;
                }
            }
            return num;
        };

        int[] ints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Integer smallest= smallestNum.apply(ints);
        System.out.println(smallest);
    }
}
