package arrays.sortingalgo;

import java.util.Arrays;

public class apnaCollegeSelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[smallest]>arr[j]){
                    smallest= j;
                }

            }
            //swapping here
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }
}
