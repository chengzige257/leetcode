package easy;

import org.testng.annotations.Test;

public class easy121 {

//    public int maxProfit(int prices[]) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice) {
//                minprice = prices[i];
//            } else if (prices[i] - minprice > maxprofit) {
//                maxprofit = prices[i] - minprice;
//            }
//        }
//        return maxprofit;
//    }

//    public int maxProfit(int prices[]) {//动态规划
//        int[][] dp = new int[prices.length][2];
//        dp[0][0] = -prices[0];
//        for (int i = 1; i < prices.length; i++){
//            dp[i][0] = Math.max(-prices[i],dp[i-1][0]);
//            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
//        }
//        return dp[prices.length-1][1];
//    }
//    public int maxProfit(int prices[]){//动态规划+滚动数组
//        int[][] dp= new int[2][2];
//        dp[0][0] = -prices[0];
//        int length = prices.length;
//        for(int i = 1;i<length;i++){
//            dp[i%2][0] = Math.max(-prices[i],dp[(i-1)%2][0]);
//            dp[i%2][1] = Math.max(dp[(i-1)%2][1],dp[(i-1)%2][0]+prices[i]);
//        }
//        return dp[(length-1)%2][1];
//    }
    public int maxProfit(int prices[]){
        int[] dp= new int[2];
        dp[0] = -prices[0];
        int length = prices.length;
        for(int i = 1;i<length;i++){
            dp[0] = Math.max(-prices[i],dp[0]);
            dp[1] = Math.max(dp[1],dp[0]+prices[i]);
        }
        return dp[1];
    }
    @Test
    public void main() {

    }
}
