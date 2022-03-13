package medium;

import org.testng.annotations.Test;

public class m279 {//完全平方数

//    public int numSquares(int n) {
//        int sqrt = (int) Math.sqrt(n);
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        for(int i=0;i<=n;i++)
//            dp[i] = i;
//        for (int i = 2; i <= sqrt; i++) {//遍历物品
//            int num = i * i;
//            for (int j = num; j <=n;j++){//遍历背包
//                if(j-num>=0)
//                    dp[j] = Math.min(dp[j],dp[j-num]+1);
//            }
//        }
//        return dp[n];
//    }
    public int numSquares(int n) {
        int sqrt = (int) Math.sqrt(n);
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i=0;i<=n;i++)
            dp[i] = i;
        for(int i = 1;i<=n;i++){//遍历背包
            for(int j = 1;j*j<=i;j++){//遍历物品
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }

    @Test
    public void main() {
        System.out.println(numSquares(12));
    }
}
