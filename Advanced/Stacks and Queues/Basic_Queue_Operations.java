import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(command[0]);
        int S = Integer.parseInt(command[1]);
        String X = command[2];
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbersQueue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            numbersQueue.offer(numbers[i]);
        }
        for (int i = 0; i < S; i++) {
            numbersQueue.poll();

        }
        if (numbersQueue.isEmpty()) {
            System.out.println("0");
        } else {
            if (numbersQueue.contains(X)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(numbersQueue));
            }
        }

    }
}
