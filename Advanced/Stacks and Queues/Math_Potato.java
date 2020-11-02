import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Math_Potato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputChildren = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>(Arrays.asList(inputChildren));

        int round = 0;

        while (queue.size() > 1) {
            boolean prime = true;
            round++;
            if (round == 1){
                prime = false;
            }
            for (int i = 2; i < round; i++) {
                if (round % i == 0){
                    prime = false;
                    break;
                }
            }

            for (int i = 0; i < n; i++) {

                if (i == n - 1){
                    if (prime){
                        System.out.println("Prime " + queue.peek());
                    }else {
                        System.out.println("Removed " + queue.poll());
                    }
                }else {
                    String current = queue.poll();
                    queue.offer(current);
                }

            }


        }
        System.out.println("Last is " + queue.poll());
    }
}