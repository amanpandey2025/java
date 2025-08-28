package quesions;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the Table you want to Print : ");
        int n = input.nextInt();

        int newNumber ;

        for (int i = 1; i <=10 ; i++) {

            newNumber = n * i;

            System.out.println(+n+ " X "+i+ " = "+newNumber);

        }
    }
}
