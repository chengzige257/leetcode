package medium;

import org.testng.annotations.Test;

public class m377 {//组合总数

    public int combinationSum4(int[] nums, int target) {
        int length = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < length; j++) {
                if (i - nums[j] >= 0) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

    @Test
    public void main() {

    }
}
