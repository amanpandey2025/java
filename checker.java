public class checker {
    public static void main(String[] args) {

        int number = 1385757879;
        int count = 0;
        while (number > 0){
            int remainder = number % 10;
            if (remainder == 7){
                count++;
            }
            number = number/10;

        }
        System.out.println("number 7 is found " +count+ " times ");
    }
}
