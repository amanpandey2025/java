public class reverse {
    public static void main(String[] args) {
        int number = 12345;
        int ans = 0;

        while (number> 0 ){
            int rem = number%10;
            number/=10;

            ans = ans * 10 + rem;
        }


        System.out.println(ans);


    }
}
