package medium;

import org.testng.annotations.Test;

public class m1049 {//最后一块石头的重量Ⅱ

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        int length = stones.length;
        for (int i = 0; i < length; i++) {
            sum += stones[i];
        }
        int target = sum/2;
        int[] dp = new int[target + 1];
        for(int i = 0;i<length;i++){
            for(int j = target; j>=stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-dp[target]-dp[target];
    }

    @Test
    public void main() {
        System.out.println(lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
