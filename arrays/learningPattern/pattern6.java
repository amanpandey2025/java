package arrays.learningPattern;

public class pattern6 {
    public static void main(String[] args) {
pattern(5);
    }
    static void pattern(int x){
        for (int i = x; i>=0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }

            System.out.println();
        }
        /*
      12345
      1234
      123
      12
      1

         */
    }
}
