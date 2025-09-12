package arrays.sortingalgo;

import java.util.Arrays;

public class againMergeSort {
    public static void main(String[] args) {
        int[] arr = {12,34,55,55,77,54,23,99,8};
        arr = divide(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] divide(int[] arr){
        if (arr.length == 1){
            return arr;        // base case.
        }

        int mid = arr.length/2;

        int[] left = divide(Arrays.copyOfRange(arr,0,mid));
        int[] right = divide(Arrays.copyOfRange(arr,mid,arr.length));
        // yha tak tha hamara devide ka kam
        return merger(left,right); // ye function dono left right ko merge kr dega .


    }

     static int[] merger(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i =0;
        int j=0;
        int k=0;

        while (i<left.length && j< right.length){
            if (left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        while (i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        return mix;
    }
}
