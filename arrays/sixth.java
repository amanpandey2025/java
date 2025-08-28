package arrays;

import java.util.Arrays;

public class sixth {
    public static void main(String[] args) {
        int[] arr = {12,45,67,8,66,77,88,51,45};
        System.out.println("the original array is :"+Arrays.toString(arr));
        reverse(arr);
        System.out.println("the reversed array is :"+Arrays.toString(arr));

        System.out.println("the maximum value in the array is :"+max(arr));
        System.out.println("the minimum value in the array is : "+min(arr));
        System.out.println("the avg of the sum of the array is :"+avgArray(arr));
        System.out.println("the length of the array is : "+arr.length);
        System.out.println("the total of the array element is "+total(arr));
    }

    static double avgArray(int[]arr){

        return total(arr) / arr.length;
    }
    static double total(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        return sum;

    }
    static  void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }

        }
        return maxValue;

    }
    static int min(int[]arr){
        int minval = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<minval){
                minval = arr[i];
            }

        }
        return minval;
    }
}
