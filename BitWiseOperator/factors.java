package BitWiseOperator;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        inputMethod();

    }

    static void fact(int x){

        for (int i = 1; i <=x ; i++) {
            if (x%i==0){
                System.out.println(i);
            }

        }
    }
    static void inputMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :");
        int x = input.nextInt();
        fact(x);
    }
    
}
