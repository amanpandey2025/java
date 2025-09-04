package arrays.learningPattern;

public class pattern2 {
    public static void main(String[] args) {
        pattern(4);

    }
    static void pattern(int x){
        for (int i = x; i>0; i--) {
            for (int j = 0; j<=i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
