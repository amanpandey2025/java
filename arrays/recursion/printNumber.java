package arrays.recursion;

public class printNumber {
    public static void main(String[] args) {
        nummber(10);

    }
     static void nummber(int n){
        //base case
        if (n==0){
            return;
        }
        //5,(n-1)
         System.out.print(n+" ");

         nummber(n-1);
         System.out.print(n+" ");
    }
}
