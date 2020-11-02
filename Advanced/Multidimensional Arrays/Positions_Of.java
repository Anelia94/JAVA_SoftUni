import java.util.Arrays;
import java.util.Scanner;

public class Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, scanner);
        int num = Integer.parseInt(scanner.nextLine());

        boolean find = false;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int currNum = matrix[r][c];
                if (currNum == num) {
                    find = true;
                    System.out.println(r + " " + c);
                }

            }

        }


        if (!find){
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            int[] numsRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[r] = numsRow;
        }
        return matrix;
    }
}
