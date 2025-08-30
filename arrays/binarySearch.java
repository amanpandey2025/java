package arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,34,55,66,77,88,99};//make sure that array is shorted
        int target = 99;
        int ans = finding(arr,target);
        System.out.println(ans);
    }
    static int finding(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
            int mid = start+(end - start) / 2;//here we will find the mid of the array.

            if (target<arr[mid]){
                end = mid- 1;//if the target element is smaller than the mid shift to left .
            } else if (target> arr[mid]) {
                start = mid+1;//if the target element is grater than the mid element than shift to right.

            }else {
                return mid;
            }
        }
        return -1;
    }

}
