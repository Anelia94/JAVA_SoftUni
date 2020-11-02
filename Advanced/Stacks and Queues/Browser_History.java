import java.util.ArrayDeque;
import java.util.Scanner;


public class Browser_History {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String line = scan.nextLine();

        while (!line.equals("Home")) {
            if ("back".equals(line)) {
                if (stack.isEmpty() || stack.size()==1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(line);
                System.out.println(stack.peek());
            }


            line = scan.nextLine();
        }

    }
}
