package arrays.learningPattern;

public class pattern5 {
    public static void main(String[] args) {
        patternIncreases(4);
        patternDecrese(4);

    }
    static void patternIncreases(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void patternDecrese(int x){
        for (int i = x; i >0 ; i--) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
