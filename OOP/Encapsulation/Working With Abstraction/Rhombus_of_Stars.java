import java.util.Scanner;

public class Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopTriangle(n);
        printBottomTriangle(n);

    }

    private static void printTopTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            printStringCountTimes(rows - i, " ");
            printStringCountTimes(i, "* ");

            System.out.println();
        }
    }

    private static void printBottomTriangle(int rows) {
        for (int i = 1; i < rows; i++) {
            printStringCountTimes(i, " ");
            printStringCountTimes(rows - i, "* ");

            System.out.println();
        }
    }


    private static void printStringCountTimes(int count, String string) {
        for (int i = 0; i < count; i++) {
            System.out.print(string);
        }
    }
}


