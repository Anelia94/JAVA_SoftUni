import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        String[] numbers = scanner.nextLine().split("\\s+");
        for (int i = 0; i < numbers.length; i++ ){
            String currNum = numbers[i];
            numbersStack.push(currNum);

        }

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");
        }


    }
}
