import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimentions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimentions[0];
        int cols = dimentions[1];
        int[][] matrix = readMatrix(rows, cols, scanner);
        int sum = getSumMatrixELements(matrix, rows, cols);
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);


    }

    private static int getSumMatrixELements(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                sum += matrix[r][c];

            }

        }

        return sum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = row[c];

            }
        }
        return matrix;
    }
}