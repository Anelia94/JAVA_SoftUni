import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[]line = scanner.nextLine().split("\\s+");
            Car car = new Car();
            car.setBrand(line[0]);
            car.setModel(line[1]);
            car.setHorsePower(Integer.parseInt(line[2]));
            System.out.println(car.getInfo());
        }
    }
}
