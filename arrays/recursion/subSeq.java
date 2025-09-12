package arrays.recursion;

public class subSeq {
    public static void main(String[] args) {
        sets("","abc");

    }
    static void sets(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch  = unprocessed.charAt(0);
        sets(processed+ch,unprocessed.substring(1));
        sets(processed,unprocessed.substring(1));
    }
}
