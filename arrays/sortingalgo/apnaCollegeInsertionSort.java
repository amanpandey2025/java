package arrays.sortingalgo;

import java.util.Arrays;

public class apnaCollegeInsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertionsort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>= 0 &&  current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //pacement
            arr[j+1] = current;
        }
    }
}
