package arrays;

public class wealth {
    public static void main(String[] args) {
        int[][] accounts = {{12,14,7},{34,56,89}};
        wealth obj = new wealth();
        int richest = obj.maximumWealth(accounts);

        System.out.println("Maximum wealth = " + richest);


    }


    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+= accounts[person][account];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
