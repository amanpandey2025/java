package arrays.learningPattern;

public class pattern4 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int x){
        for (int i = 1; i <=x; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");

            }

        System.out.println();
        }
        /*
      1
      12
      123
      1234
      12345

         */
    }
}
