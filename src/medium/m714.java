package medium;

import org.testng.annotations.Test;

public class m714 {//买卖股票的最佳时机
    public int maxProfit(int[] prices, int fee) {
        int[] dp= new int[2];
        dp[0] = prices[0];
        int length = prices.length;
        for(int i = 1;i<length;i++){
            dp[0] = Math.min(prices[i]-dp[1],dp[0]);
            dp[1] = Math.max(dp[1],prices[i]-dp[0]-fee);
        }
        return dp[1];
    }
    @Test
    public void main() {
        System.out.println(maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}
