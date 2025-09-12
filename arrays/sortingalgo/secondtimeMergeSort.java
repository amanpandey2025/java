package arrays.sortingalgo;

import java.util.Arrays;

public class secondtimeMergeSort {
    public static void main(String[] args) {
        int[] arr = {34,56,68,435,3,565,8,878};
        arr = divide(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] divide(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;

        int[] left = divide(Arrays.copyOfRange(arr,0,mid));
        int[] right = divide(Arrays.copyOfRange(arr,mid,arr.length));
        return merger(left,right);
    }
    static int[] merger(int[] left,int[] right){
        int[] mix = new int[left.length + right.length];
        int i=0;
        int j = 0;
        int k = 0;

        while (i< right.length&& j< left.length){
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
