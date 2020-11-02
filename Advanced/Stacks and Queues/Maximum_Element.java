import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer>numbersStack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];


            switch (command) {
                case "1":
                    int currNum = Integer.parseInt(tokens[1]);
                    numbersStack.push(currNum);
                    break;
                case "2":
                    numbersStack.pop();
                    break;
                case "3":
                    System.out.println(numbersStack.stream().mapToInt(Integer::intValue).max().getAsInt());
                    break;
            }


        }



    }
}
