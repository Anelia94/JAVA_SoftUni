import java.util.Scanner;
import java.util.function.Consumer;

public class Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String[]> addSirAndPrint = stringArr -> {
            for (String s : stringArr) {
                System.out.println("Sir " + s);
            }
        };
        String[] names  = scanner.nextLine().split("\\s+");
        addSirAndPrint.accept(names);

    }
}
