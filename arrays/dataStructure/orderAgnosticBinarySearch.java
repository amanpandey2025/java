package arrays.dataStructure;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,20,40,50,60}; // descending order array
        int target = 10;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is ascending or descending
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isASC) {
                // Ascending order case
                if (target < arr[mid]) {
                    end = mid - 1;   // ✅ fix
                } else {
                    start = mid + 1; // ✅ fix
                }
            } else {
                // Descending order case
                if (target > arr[mid]) {
                    end = mid - 1;   // ✅ fix
                } else {
                    start = mid + 1; // ✅ fix
                }
            }
        }

        return -1;
    }
}
