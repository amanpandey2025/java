package arrays.learningPattern;

public class advancepattern {
    public static void main(String[] args) {
        advance(4);

    }
    static void advance(int x){
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }

            //spaces print
            int spaces = 2*(x-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");

            }
            //right side stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        //lower half
        for (int i = x; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }

            //spaces print
            int spaces = 2*(x-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");

            }
            //right side stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }

        System.out.println();
        }
    }
}
