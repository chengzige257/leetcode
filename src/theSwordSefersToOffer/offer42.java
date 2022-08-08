package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer42 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = max;
        for(int i = 1;i<dp.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    @Test
    public void main() {

    }
}
