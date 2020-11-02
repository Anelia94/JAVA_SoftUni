import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> binary = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println("0");
        } else {

            while (num > 0) {
                if (num % 2 == 0) {
                    binary.push(0);
                } else {
                    binary.push(1);
                }

                num = num / 2;
            }
            while (!binary.isEmpty()) {
                System.out.print(binary.pop());
            }
        }



    }
}

