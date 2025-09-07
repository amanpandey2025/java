package BitWiseOperator;

public class oddEven {
    public static void main(String[] args) {
        oddeven(88);

    }

    static void oddeven(int x) {
        if ((x & 1) == 1) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even ");
        }


    }
}
