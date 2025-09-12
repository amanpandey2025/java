package arrays.recursion;

public class asciiValue {
    public static void main(String[] args) {
        ASCIIvalue("","a");

    }
    static void ASCIIvalue(String processed,String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        ASCIIvalue(processed,unprocessed.substring(1));
        ASCIIvalue(processed +ch,unprocessed.substring(1));
        ASCIIvalue(processed + (ch+0),unprocessed.substring(1));
    }
}
