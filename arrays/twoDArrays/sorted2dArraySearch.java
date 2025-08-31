package arrays.twoDArrays;

import java.util.Arrays;

public class sorted2dArraySearch {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,30,45},
                {28,29,37,49},
                {33,34,38,50},

        };
        System.out.println(Arrays.toString(search(arr,99)));
    }

    static int[] search(int[][] arr,int target){
        int row = 0;
        int column = arr.length-1;

        while (row<arr.length && column>=0){
            if (arr[row][column] == target){
                return new int[]{row,column};
            }
            if (arr[row][column]< target) {
                row++;

            }else {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
