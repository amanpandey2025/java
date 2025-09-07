package BitWiseOperator;

public class root {
    public static void main(String[] args) {
        int n = 37;
        System.out.println("Square root of " + n + " = " + SquareRootBinarySearch.squareRoot(n));

    }

    public class SquareRootBinarySearch {
        public static int squareRoot(int n) {
            int start = 0, end = n, ans = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (mid * mid == n) {
                    return mid;  // exact square root
                } else if (mid * mid < n) {
                    ans = mid;      // store possible answer
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;  // integer part of sqrt
        }

    }
}
