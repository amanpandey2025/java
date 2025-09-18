package arrays.twoDArrays;

public class gcd {
    public static void main(String[] args) {
        System.out.println(sumOfnaturalNumber(5));

    }
    static int number(int a, int b){
        if (b == 0){
            return a;    // base case
        }
        return number(b,a%b);// this is recursive call.

    }

    static int sumOfnaturalNumber(int num){
        if (num == 0){
            return 0;
        }
        return num + sumOfnaturalNumber(num-1);
    }


}
