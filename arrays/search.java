package arrays;

public class search {
    public static void main(String[] args) {
        String name = "aman pandey";
        char target = 'a';
        System.out.println(sst(name ,target));

    }

    static boolean sst(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
