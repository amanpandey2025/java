package arrays;


import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] num = {3,46,8,9};
        sort(num,0, num.length-1);
        System.out.println(Arrays.toString(num));

    }
    static void sort(int[] num,int low ,int high){
        if (low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = num[mid];
        while (start<=end){
            while (num[start]<pivot){
                start++;
            }
            while (num[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
        sort(num,low,end);
        sort(num,high,start);

    }
}
