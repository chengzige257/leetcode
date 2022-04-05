package easy;

import org.testng.annotations.Test;

public class easy53 {//最大子数组和
//    public int maxSubArray(int[] nums) {
//        int length = nums.length;
//        int[] dp = new int[length];
//        dp[0] = nums[0];
//        int max = nums[0];
//        for(int i = 1;i<length;i++){
//            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
//            if(dp[i]>max) max = dp[i];
//        }
//        return max;
//    }
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        int current = nums[0];
        for(int i= 1;i<length;i++){
            if(nums[i]+current<current){
                current = nums[i];
            }else{
                current = current+nums[i];
            }
            max = Math.max(max,current);
        }
        return max;
    }

    @Test
    public void main() {
        System.out.println(maxSubArray(new int[]{1, 2, 3, 4}));
    }
}
