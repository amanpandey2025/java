package arrays.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial1(5));
    }
    public static int factorial1(int x){
        if (x==1){
            return 1;
        }
        return x * factorial1(x-1);
    }
}
