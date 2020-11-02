import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String page = scanner.nextLine();

        while (!page.equals("Home")) {
            if (page.equals("back")) {
                if (browserHistory.size()<=1) {
                    System.out.println("no previous URLs");
                } else {
                    String currPage = browserHistory.peek();
                    forwardHistory.push(currPage);
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }


            } else if (page.equals("forward")) {
                if(forwardHistory.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    String curr = forwardHistory.peek();
                    browserHistory.push(curr);
                    forwardHistory.pop();
                    System.out.println(browserHistory.peek());

                }
            } else {
                browserHistory.push(page);
                forwardHistory.clear();
                System.out.println(browserHistory.peek());
            }

            page = scanner.nextLine();
        }


    }
}
