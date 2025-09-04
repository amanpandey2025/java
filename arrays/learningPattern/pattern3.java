package arrays.learningPattern;

public class pattern3 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int x){
        for (int i = 1; i < x; i++) {
            //for spaces loop
            for (int j = 1; j < x-i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
