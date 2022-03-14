package medium;

import org.testng.annotations.Test;

public class m1143 {


//    public int longestCommonSubsequence(String text1, String text2) {//"abcba", "abcbcba"压缩成一维数组失败了
//        int m = text1.length();
//        int n = text2.length();
//        int[] dp = new int[n+1];
//        int max = 0;
//        for(int i = 1;i<=m;i++){
//            for(int j = 1;j<=n;j++){
//                if(text1.charAt(i-1)==text2.charAt(j-1)){
//                    dp[j] = dp[j-1]+1;
//                    max = Math.max(max,dp[j]);
//                }else{
//                    dp[j] = Math.max(dp[j],dp[j-1]);
//                }
//            }
//        }
//        return max;
//    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
    @Test
    public void main() {
        System.out.println(longestCommonSubsequence("abcba", "abcbcba"));
    }
}
