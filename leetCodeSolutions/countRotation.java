package leetCodeSolutions;

public class countRotation {
    public static void main(String[] args) {
        int[] nums1 = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation count: " + findRotationCount(nums1)); // 2

        int[] nums2 = {7, 9, 11, 12, 5};
        System.out.println("Rotation count: " + findRotationCount(nums2)); // 4

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Rotation count: " + findRotationCount(nums3)); // 0


    }
    static int findRotationCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // if array is already sorted, smallest element is at start
            if (nums[start] <= nums[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            // check if mid is smallest
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            // left side sorted, so pivot must be on right
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
            // right side sorted, pivot must be on left
            else {
                end = mid - 1;
            }
        }
        return -1; // should never reach here
    }
}


