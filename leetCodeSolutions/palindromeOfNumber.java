package leetCodeSolutions;

public class palindromeOfNumber {
    public static void main(String[] args) {
        int num = 676;
        boolean ans = isPalindrome(num);
        if (ans) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is NOT a Palindrome number");
        }


    }
    static boolean isPalindrome(int x){
        int original = x;
        int reverse = 0;
        while (x>0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;

        }
        return original == reverse;
    }
}
