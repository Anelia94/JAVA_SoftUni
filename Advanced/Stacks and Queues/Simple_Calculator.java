import java.util.*;


public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();

        for (int i = tokens.length-1; i >=0; i--) {
            String curr = tokens[i];
            stack.push(curr);


        }



        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());
            String op = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (op) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }

        System.out.println(stack.pop());


    }
}
