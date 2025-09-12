package arrays.recursion;

import java.util.Arrays;

public class removeStringWord {
    public static void main(String[] args) {
        String str = "apple,banana,grapes,banana";
        str = skipword(str);
        System.out.println(str);
    }
    static String skipword(String unprocessed){
        if (unprocessed.isEmpty()){
            return " ";
        }
        if (unprocessed.startsWith("apple")){
            return skipword(unprocessed.substring(5));
        }else
            return unprocessed.charAt(0) +unprocessed.substring(1);
    }
}
