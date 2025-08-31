package leetCodeSolutions;

public class rotatedshortedArray {
    //also known as bytonic arrary . first the number increase and then dicreases .
    public static void main(String[] args) {


        rotatedshortedArray obj = new rotatedshortedArray();

        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 0;
        System.out.println("Target " + target1 + " found: " + obj.search(nums1, target1)); // true

        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println("Target " + target2 + " found: " + obj.search(nums2, target2)); // false

        int[] nums3 = {1,0,1,1,1};
        int target3 = 0;
        System.out.println("Target " + target3 + " found: " + obj.search(nums3, target3)); // true

    }
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // if duplicates are present
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // left sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    
}
