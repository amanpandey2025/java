package arrays;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,66,7,7,8,99,9,88};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] arr) {
        arr[0] = 67;
    }
}
