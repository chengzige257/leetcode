package easy;

public class easy70 {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int[] dp = new int[n];
        dp[0] =1;
        dp[1] =2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

//    public int climbStairs(int n) {//完全背包
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=2;j++){
//                if(i>=j){
//                    dp[i] += dp[i-j];
//                }
//            }
//        }
//        return dp[n];
//    }
}
