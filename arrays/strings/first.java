package arrays.strings;

public class first {
    public static void main(String[] args) {
        String name  = "Aman Pandey";
        //System.out.println(name);
       /* String a = "aman";// ye ek a name ka object he jisme aman stored he
        System.out.println(a);
         a = "pandey";// ye naya obj ban gya . naaa ki chaange ho gye string.
        System.out.println(a);*/
String a = "aman";
String b = "aman";
        System.out.println(a.equals(b));//this will give true.
        String c  = new String("pandey");
        String d = new String("pandey");

        System.out.println(c==d);//this will give false .
        System.out.println(c.equals(d));//this will give true now .



    }

}
