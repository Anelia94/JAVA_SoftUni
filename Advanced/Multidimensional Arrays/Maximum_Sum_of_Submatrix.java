import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum_of_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimentions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);

        int[][] matrix = readMatrix(rows, cols, scanner);
        int[][] bestMatrix = new int[2][2];
        int bestSum = 0;

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                int sum = matrix[r][c] + matrix[r + 1][c] + matrix[r][c + 1] + matrix[r + 1][c + 1];


                if (sum > bestSum) {
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[r][c];
                    bestMatrix[1][0] = matrix[r + 1][c];
                    bestMatrix[0][1] = matrix[r][c + 1];
                    bestMatrix[1][1] = matrix[r + 1][c + 1];
                }

            }

        }
        for (int i = 0; i < bestMatrix.length; i++) {
            for (int j = 0; j < bestMatrix[i].length; j++) {
                System.out.print(bestMatrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println(bestSum);

    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = row;

        }
        return matrix;
    }
}
