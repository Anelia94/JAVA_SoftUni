import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] firstMatrix = getMatrix(scanner);
        int[][] secondMatrix = getMatrix(scanner);

        boolean compare = CompareMatrices(firstMatrix, secondMatrix);

        if(compare){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }

    public static boolean CompareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        boolean compare = true;
        if (firstMatrix.length != secondMatrix.length) {
            compare = false;
        } else {
            for (int rows = 0; rows < firstMatrix.length; rows++) {
                int[] firstArray = firstMatrix[rows];
                int[] secondArray = secondMatrix[rows];
                if (firstArray.length != secondArray.length) {
                    compare = false;
                } else {
                    for (int cols = 0; cols < firstArray.length; cols++) {
                        int firstNum = firstMatrix[rows][cols];
                        int secondNum = secondMatrix[rows][cols];
                        if(firstNum!=secondNum){
                            compare = false;

                        }


                    }
                }

            }
        }
        return compare;
    }

    private static int[][] getMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        int[][] numbers = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            int[] numRows = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            numbers[r] = numRows;


        }
        return numbers;
    }
}
