public class functions {
    public static void main(String[] args) {
        greatting();
        greatting();
        String massage = aman();
        System.out.println(massage);
      int ans =  sum(12,43);
        System.out.println(ans);

    }

    static void greatting(){
        System.out.println("hellow how are you my brother ");
    }
    static  String aman(){
        String pandey = "i am aman pandey ";
        return pandey;
    }
    static int sum(int a, int b){
        int total = a + b;
        return total;
    }
}
