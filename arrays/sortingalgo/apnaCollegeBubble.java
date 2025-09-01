package arrays.sortingalgo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class apnaCollegeBubble {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,2,2,1};
        bubbleApnaCollege(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleApnaCollege(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                //swap if grater.
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if (!swapped){
                break;
            }

        }
    }
}
