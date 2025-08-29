package arrays.dataStructure;


public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {100,70,66,55,40,33,22,11,9,5,3};//decending order array
        int target = 100;
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
                start = mid+1;//if the target element is smaller than the mid shift to right .
            } else if (target> arr[mid]) {
                end = mid-1;//if the target element is grater than the mid element than shift to left.

            }else {
                return mid;
            }
        }
        return -1;
    }

}
