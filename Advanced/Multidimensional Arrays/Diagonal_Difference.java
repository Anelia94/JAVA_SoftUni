import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[sizeMatrix][];
        FillMatrix(scanner, sizeMatrix, matrix);

        int sumPrimaryDiagonal = sumPrimaryDiagonal(sizeMatrix, matrix);
        int sumSecondaryDiagonal = getSumSecondaryDiagonal(sizeMatrix, matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));

    }

    public static int getSumSecondaryDiagonal(int sizeMatrix, int[][] matrix) {
        int sumSecondaryDiagonal = 0;
        for (int r = 0; r < sizeMatrix; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (c == matrix.length - 1 - r) {
                    sumSecondaryDiagonal += matrix[r][c];
                }
            }

        }
        return sumSecondaryDiagonal;
    }

    public static int sumPrimaryDiagonal(int sizeMatrix, int[][] matrix) {
        int sumPrimaryDiagonal = 0;
        for (int r = 0; r < sizeMatrix; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (r == c) {
                    sumPrimaryDiagonal += matrix[r][c];
                }

            }

        }
        return sumPrimaryDiagonal;
    }

    public static void FillMatrix(Scanner scanner, int sizeMatrix, int[][] matrix) {
        for (int row = 0; row < sizeMatrix; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}


