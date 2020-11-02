import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        String[] firstLine = scanner.nextLine().split("\\s+");
        String[] secondLine = scanner.nextLine().split("\\s+");

        int N = Integer.parseInt(firstLine[0]);
        int S = Integer.parseInt(firstLine[1]);
        String X = firstLine[2];

        for (int i = 0; i < N; i++) {
            String currNum = secondLine[i];
            numbersStack.push(currNum);


        }

        for (int i = 0; i < S; i++) {
            numbersStack.pop();

        }

        if (numbersStack.isEmpty()) {
            System.out.println("0");
        } else {
            if (numbersStack.contains(X)) {
                System.out.println("true");
            } else{
                System.out.println(numbersStack.stream().mapToInt(Integer::parseInt).min().getAsInt());}
        }
    }
}
