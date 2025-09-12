package arrays.sortingalgo;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {8,3,42,1,44,33,55,77,77};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j< second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //if one of the array is not complete return the remaining end element k. in the end after comparing
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
