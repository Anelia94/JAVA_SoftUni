import java.util.ArrayDeque;
import java.util.Scanner;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequence = scanner.nextLine().split("");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < sequence.length; i++) {

            if (stack.isEmpty()) {
                stack.push(sequence[i]);
            } else {
                String prevParentheses = stack.peek();
                String currParentheses = sequence[i];
                if (prevParentheses.equals("(") && currParentheses.equals(")")) {
                    stack.pop();
                } else if (prevParentheses.equals("{") && currParentheses.equals("}")) {
                    stack.pop();
                } else if (prevParentheses.equals("[") && currParentheses.equals("]")) {
                    stack.pop();
                } else {
                    stack.push(sequence[i]);
                }
            }

        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

