package arrays;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,34,56,789,877,44,55,99};
        System.out.println(FindNumbers(nums));

    }

    static int FindNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

     static boolean even(int num) {
        int numberOfDigits = digits(num);
         return numberOfDigits % 2 == 0;
     }


    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num /10;
        }

        return count;

    }
}
