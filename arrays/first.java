package arrays;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("enter "+size+" roolnumbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = input.nextInt();
            
        }
        System.out.println("the rollNumbers are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        input.close();



    }
}
