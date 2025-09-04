package arrays.strings;

public class PrittyPrinting {
    public static void main(String[] args) {
        float a = 34343.787887f;
        System.out.printf("%.2f",Math.PI);
        //System.out.printf("the formated data is %.2f",a);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);


        }
        System.out.println(builder);

    }
}
