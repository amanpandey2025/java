package arrays.strings;

public class question {
    public static void main(String[] args) {
        String str = "abcbefergerga";
        StringBuilder builder = new StringBuilder(str);
        String reverse = builder.reverse().toString();

        if (str.equals(reverse)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }

}
