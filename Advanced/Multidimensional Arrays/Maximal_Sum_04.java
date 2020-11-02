import java.util.Arrays;
import java.util.Scanner;

public class Maximal_Sum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = dimensions[0];
        int m = dimensions[1];

        int[][] matrix = new int[n][m];
        FillMatrix(scanner, matrix);

        int maxSum = 0;
        int[][] newMatrix = new int[3][3];
        for (int r = 0; r < n - 2; r++) {
            for (int c = 0; c < m - 2; c++) {
                int sum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2] +
                        matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2] +
                        matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    newMatrix[0][0] = matrix[r][c];
                    newMatrix[0][1] = matrix[r][c + 1];
                    newMatrix[0][2] = matrix[r][c + 2];
                    newMatrix[1][0] = matrix[r + 1][c];
                    newMatrix[1][1] = matrix[r + 1][c + 1];
                    newMatrix[1][2] = matrix[r + 1][c + 2];
                    newMatrix[2][0] = matrix[r + 2][c];
                    newMatrix[2][1] = matrix[r + 2][c + 1];
                    newMatrix[2][2] = matrix[r + 2][c + 2];
                }
            }

        }

        System.out.println(String.format("Sum = %d",maxSum));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2) {
                    System.out.print(newMatrix[row][col]);
                } else {
                    System.out.print(newMatrix[row][col] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void FillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}

