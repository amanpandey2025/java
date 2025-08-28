package quesions;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();

        double sum = 0;
        for (int i = 0; i <=n ; i++) {
            sum = sum+i;

        }
        System.out.println(sum);
    }
}
