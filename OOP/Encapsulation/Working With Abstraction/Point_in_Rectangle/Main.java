package Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point2D bottomLeft = new Point2D(coordinates[0],coordinates[1]);
        Point2D topRight = new Point2D(coordinates[2],coordinates[3]);
        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        int count = Integer.parseInt(scanner.nextLine());

        while(count-- > 0){
            int[] pointCoordinates = Arrays.stream(scanner.nextLine()
                    .split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point2D point = new Point2D(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(point));

        }
    }
}
