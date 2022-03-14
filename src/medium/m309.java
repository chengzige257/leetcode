package medium;

import org.testng.annotations.Test;

public class m309 {
    //0:买入（持有）股票状态
    //1:不持有股票状态，即度过了冷冻期
    //2:今天卖出股票状态
    //3:冷冻期
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[length][4];
        dp[0][0] = -prices[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][3]))-prices[i];
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][3]);
            dp[i][2] = dp[i-1][0] + prices[i];
            dp[i][3] = dp[i-1][2];
        }
        return Math.max(dp[length-1][1],Math.max(dp[length-1][2],dp[length-1][3]));
    }

    @Test
    public void main () {
        System.out.println(maxProfit(new int[]{7,4,2,1}));
    }
}
