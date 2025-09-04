package arrays.learningPattern;

public class pattern7 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int x){
        int number = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(number);
                number++;

            }
            System.out.println();

        }


    }
}
