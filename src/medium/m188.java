package medium;

import org.testng.annotations.Test;

public class m188 {//买卖股票的最佳时机Ⅳ

    public int maxProfit(int k, int[] prices) {
        if(prices.length==0)
            return 0;
        if (k == 0)
            return 0;
        int[] dp = new int[2 * k + 1];
        int length = prices.length;
        for (int i = 1; i <= 2 * k; i = i + 2) {
            dp[i] = prices[0];
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= 2 * k; j=j+2) {
                dp[j] = Math.min(dp[j],prices[i]-dp[j-1]);//最小成本
                dp[j+1] = Math.max(dp[j+1],prices[i]-dp[j]);//最大利润
            }
        }
        return dp[2*k];
    }

    @Test
    public void main() {

    }
}
