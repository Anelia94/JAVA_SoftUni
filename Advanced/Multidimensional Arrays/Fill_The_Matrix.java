import java.util.Arrays;
import java.util.Scanner;

public class Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(tokens[0]);
        String method = tokens[1];


        int[][] matrix = new int[matrixSize][matrixSize];
        switch (method) {
            case "A":
                FillMatrixMethodA(matrixSize, matrix);
                break;
            case "B":
                fillMatrixMethodB(matrixSize, matrix);
                break;
        }

        PrintMatrix(matrixSize, matrix);

    }

    public static void PrintMatrix(int matrixSize, int[][] matrix) {
        for (int rows = 0; rows < matrixSize; rows++) {
            for (int cols = 0; cols < matrixSize; cols++) {
                System.out.print(matrix[rows][cols] + " ");


            }
            System.out.println();
        }
    }

    public static void fillMatrixMethodB(int matrixSize, int[][] matrix) {
        int num = 1;
        for (int col = 0; col < matrixSize; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrixSize; row++) {
                    matrix[row][col] = num;
                    num++;
                }
            } else {
                for (int row = matrixSize - 1; row >=0 ; row--) {
                    matrix[row][col] = num;
                    num++;
                }
            }


        }
    }

    public static void FillMatrixMethodA(int matrixSize, int[][] matrix) {
        int num = 1;
        for (int cols = 0; cols < matrixSize; cols++) {
            for (int rows = 0; rows < matrixSize; rows++) {
                matrix[rows][cols] = num;
                num++;
            }
        }
    }
}

