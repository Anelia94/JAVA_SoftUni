import java.util.Arrays;
import java.util.Scanner;

public class Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            int[] row = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = row;
        }

        printPrimaryDiagonal(matrix);
        printSecondaryDiagonal(matrix);

    }

    private static void printSecondaryDiagonal(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if (row == matrix.length -1 -col){
                    System.out.print(matrix[row][col]+" ");
                }
            }
        }
        System.out.println();
    }

    private static void printPrimaryDiagonal(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                if (row == col){
                    System.out.print(matrix[row][col]+" ");
                }
            }

        }
        System.out.println();
    }
}
