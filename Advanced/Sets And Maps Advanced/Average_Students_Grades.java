import java.text.DecimalFormat;
import java.util.*;

public class Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<Double, Integer> digits = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double digit = Double.parseDouble(input[i]);
            digits.putIfAbsent(digit, 0);
            Integer integer = digits.get(digit);
            integer++;
            digits.put(digit, integer);

        }
        digits.forEach((k, v) -> {
            System.out.printf("%.1f -> %d%n",k,v);
        });


    }
}
