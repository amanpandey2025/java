package arrays;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the string array: ");
        int size = input.nextInt();
        input.nextLine(); // 👈 buffer clear karne ke liye

        String[] arr = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }

        System.out.println("The names are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + ". " + arr[i]); // index + name print
        }

        input.close();
    }
}

