package arrays.recursion;

public class removeString {
    public static void main(String[] args) {
        skip("","bbaaaabaaa");

    }
    static void skip(String processed,String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch=='a'){
            skip(processed,unprocessed.substring(1));
        }else
            skip(processed+ch,unprocessed.substring(1));
    }
}
