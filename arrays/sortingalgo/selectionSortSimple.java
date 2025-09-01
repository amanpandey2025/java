package arrays.sortingalgo;

import java.util.Arrays;

public class selectionSortSimple {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort1(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxIndex = 0;

            // find max element in range [0...last]
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap max element with element at "last"
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
}
