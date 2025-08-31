package leetCodeSolutions;

import java.util.Arrays;

public class findTheIndex {
    public static void main(String[] args) {
        findTheIndex obj = new findTheIndex();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(ans)); // Output: [3,4]
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int Search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // potential answer
                if (findStartIndex) {
                    end = mid - 1; // keep searching left
                } else {
                    start = mid + 1; // keep searching right
                }
            }
        }
        return ans;
    }
}
