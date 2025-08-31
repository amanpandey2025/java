package arrays.sortingalgo;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run N-1 times .
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            //max element found at the end.
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                //swap item if it is smaller than previous .
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            //if the array is already sorted no need to check again and again.
            if (!swapped){
                break;
            }
        }
    }
}
