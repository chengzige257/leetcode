package medium;

import org.testng.annotations.Test;

public class m122 {
//    public int maxProfit(int prices[]){
//        int[][] dp= new int[2][2];
//        dp[0][0] = -prices[0];
//        int length = prices.length;
//        for(int i = 1;i<length;i++){
//            dp[i%2][0] = Math.max(dp[(i-1)%2][1]-prices[i],dp[(i-1)%2][0]);
//            dp[i%2][1] = Math.max(dp[(i-1)%2][1],dp[(i-1)%2][0]+prices[i]);
//        }
//        return dp[(length-1)%2][1];
//    }
//    public int maxProfit(int prices[]){
//        int[][] dp= new int[2][2];
//        dp[0][0] = prices[0];
//        int length = prices.length;
//        for(int i = 1;i<length;i++){
//            dp[i%2][0] = Math.min(prices[i]-dp[(i-1)%2][1],dp[(i-1)%2][0]);
//            dp[i%2][1] = Math.max(dp[(i-1)%2][1],prices[i]-dp[(i-1)%2][0]);
//        }
//        return dp[(length-1)%2][1];
//    }
//    public int maxProfit(int prices[]){
//        int[] dp= new int[2];
//        dp[0] = prices[0];
//        int length = prices.length;
//        for(int i = 1;i<length;i++){
//            dp[0] = Math.min(prices[i]-dp[1],dp[0]);
//            dp[1] = Math.max(dp[1],prices[i]-dp[0]);
//        }
//        return dp[1];
//    }
    public int maxProfit(int prices[]){
        int[] dp= new int[2];
        dp[0] = -prices[0];
        int length = prices.length;
        for(int i = 1;i<length;i++){
            dp[0] = Math.max(-prices[i]+dp[1],dp[0]);
            dp[1] = Math.max(dp[1],prices[i]+dp[0]);
        }
        return dp[1];
    }
    @Test
    public void main() {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
