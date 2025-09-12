package arrays.recursion;

public class removeFromString {
    public static void main(String[] args) {
        System.out.println(skipword("apple,banana ,grapes"));

    }

    static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'b') {
            skip(processed, unprocessed.substring(1));
        } else
            skip(processed + ch, unprocessed.substring(1));

    }

    static String skipword(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }
        if (unprocessed.startsWith("apple")) {
            return skipword(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + skipword(unprocessed.substring(1));
        }
    }
}
