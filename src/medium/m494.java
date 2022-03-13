package medium;

import org.testng.annotations.Test;

public class m494 {//目标和

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }
        if(target>sum) return 0;
        if ((sum + target) % 2 == 1)
            return 0;

        target = (sum + target) / 2;
        if(target<0)
            return 0;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < length; i++) {
            for(int j = target;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[target];
    }

    @Test
    public void main() {
        System.out.println(findTargetSumWays(new int[]{100}, -200));
    }
}
