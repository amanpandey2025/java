package arrays.twoDArrays;

import java.util.Scanner;

public class twodArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int rows = input.nextInt();
        System.out.println("enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
           //this is the code for input .
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        // this code is for output of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+ " ");


            }
            System.out.println();

        }
    }
}
