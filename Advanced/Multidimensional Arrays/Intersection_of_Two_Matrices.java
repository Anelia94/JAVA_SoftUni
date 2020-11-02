import java.util.Arrays;
import java.util.Scanner;

public class Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);

        char[][] finalMatrix = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char charFirstMatrix = firstMatrix[r][c];
                char charSecondMatrix = secondMatrix[r][c];

                if (charFirstMatrix==charSecondMatrix) {
                    finalMatrix[r][c] = charFirstMatrix;
                } else {
                    finalMatrix[r][c] = '*';
                }

            }
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(finalMatrix[i][j]+" ");

            }
            System.out.println();
        }



    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] row = (scanner.nextLine().split("\\s+"));
            for (int c = 0; c < cols ; c++) {
                char currChar = row[c].charAt(0);
                matrix[r][c] = currChar;

            }

        }
        return matrix;
    }
}
