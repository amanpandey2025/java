package leetCodeSolutions;

public class letterCeiling {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','f','j'}; // make sure array is sorted
        char target = 'j';
        char ans = Finding(arr, target);
        System.out.println(ans); // Output = c

    }

    static char Finding(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;

            }else {
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
