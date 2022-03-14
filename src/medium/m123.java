package medium;

import org.testng.annotations.Test;

public class m123 {

//    public int maxProfit(int[] prices) {//买卖股票的最佳时机Ⅲ
//        int length = prices.length;
//        int[][] dp = new int[length][5];
//        dp[0][1] = dp[0][3] = -prices[0];
//        for(int i = 1;i<length;i++){
//            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
//            dp[i][2] = Math.max(dp[i-1][1]+prices[i],dp[i-1][2]);
//            dp[i][3] = Math.max(dp[i-1][2]-prices[i],dp[i-1][3]);
//            dp[i][4] = Math.max(dp[i-1][3]+prices[i],dp[i-1][4]);
//        }
//        return dp[length-1][4];
//    }

    //    public int maxProfit(int[] prices) {//动态规划版本二，优化空间
//        int length = prices.length;
//        int[] dp = new int[5];
//        dp[1] = dp[3] = -prices[0];
//        for(int i = 1;i<length;i++){
//            dp[1] = Math.max(dp[0]-prices[i],dp[1]);
//            dp[2] = Math.max(dp[1]+prices[i],dp[2]);
//            dp[3] = Math.max(dp[2]-prices[i],dp[3]);
//            dp[4] = Math.max(dp[3]+prices[i],dp[4]);
//        }
//        return dp[4];
//    }
    //版本三
    public int maxProfit(int[] prices) {//动态规划版本二，优化空间
        int length = prices.length;
        int[] dp = new int[5];
        dp[1] = dp[3] = prices[0];
        for (int i = 1; i < length; i++) {
            dp[1] = Math.min(prices[i] - dp[0], dp[1]);
            dp[2] = Math.max(prices[i] - dp[1], dp[2]);
            dp[3] = Math.min(prices[i] - dp[2], dp[3]);
            dp[4] = Math.max(prices[i] - dp[3], dp[4]);
        }
        return dp[4];
    }

    @Test
    public void main() {
        System.out.println(maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }
}
