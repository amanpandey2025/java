package arrays.recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fiboo(7));
    }
    public static int fiboo(int x){
        if (x==0){
            return 0;
        }
        if (x==1){
            return 1;
        }

        return fiboo(x-1) + fiboo(x-2);
    }
}
