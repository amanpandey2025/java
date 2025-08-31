package arrays.twoDArrays;

import java.util.Scanner;

public class searchingElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("enter the number of colums:");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

// the code is for input .
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        System.out.println("enter the element you want to search");
        int x = input.nextInt();
        boolean found = false;
        //code for scearching the element in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == x){
                    System.out.println("the number" +x+ " is found at index :"+i+" "+j);
                    found = true;
                }

            }

        }
        if (!found) {
            System.out.println("The number " + x + " is not found in the matrix.");
        }
    }
}
