package medium;

import org.testng.annotations.Test;

public class m518 {//零钱兑换Ⅱ

    public int change(int amount, int[] coins) {
        int length = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < length; i++) {
            for (int j = coins[i];j<=amount;j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
    @Test
    public void main() {
        System.out.println(change(5, new int[]{1, 2, 5}));
    }
}
