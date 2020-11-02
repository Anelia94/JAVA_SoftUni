import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            if (line.length == 1) {
                Car car = new Car(line[0]);
                System.out.println(car.getInfo());
            } else if (line.length == 3) {
                Car car = new Car(line[0], line[1], Integer.parseInt(line[2]));
                System.out.println(car.getInfo());
            }

        }
    }
}
