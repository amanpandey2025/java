package arrays;

public class linerSearch {
    public static void main(String[] args) {
                int[] nums = {18,12,9,14,77,50};
                int target = 99;
                int ans = find(nums,target);
                System.out.println(ans);

    }

    static int find(int[] arr,int target){
        if (arr.length ==  0){
            return -1;
        }
        // running a for loop here
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }


        }
        return -1;
    }
}
