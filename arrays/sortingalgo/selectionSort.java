package arrays.sortingalgo;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max and place to the correct index .
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }

    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {   // ✅ <= end tak loop
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;   // ✅ correct value return karo
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
