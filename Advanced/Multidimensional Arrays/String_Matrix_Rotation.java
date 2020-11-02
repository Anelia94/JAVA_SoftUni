import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotate = scanner.nextLine().split("[( )]+");
        int degrees = Integer.parseInt(rotate[1]) % 360;

        String words = scanner.nextLine();

        List<String> linesOfMatrix = new ArrayList<>();
        int maxLength = words.length();
        while (!words.equals("END")) {
            linesOfMatrix.add(words);
            if (words.length() > maxLength) {
                maxLength = words.length();
            }
            words = scanner.nextLine();
        }

        int rows = linesOfMatrix.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        FillTheMatrix0degrees(linesOfMatrix, rows, cols, matrix);
        switch (degrees) {
            case 0:
                PrintMatrix(rows, cols, matrix);
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();

                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0 ; col--) {
                    for (int row = 0; row < rows ; row++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();

                }
                break;

        }


    }

    public static void PrintMatrix(int rows, int cols, char[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void FillTheMatrix0degrees(List<String> linesOfMatrix, int rows, int cols, char[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < linesOfMatrix.get(row).length()) {
                    matrix[row][col] = linesOfMatrix.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }

            }

        }
    }
}
