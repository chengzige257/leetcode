package medium;

import org.testng.annotations.Test;

public class m300 {//最长递增子序列
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if(length==0)
            return 0;
        int[] dp = new int[length];
        int max = 1;
        for(int i = 0;i<=length-1;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    @Test
    public void main() {
        System.out.println(lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }
}
