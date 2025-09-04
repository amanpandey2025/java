package arrays.learningPattern;

public class pattern1 {
    public static void main(String[] args) {
        pattern(4);

    }

    static void pattern(int x){
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <=x ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
