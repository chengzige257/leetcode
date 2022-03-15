package medium;

import org.testng.annotations.Test;

public class m516 {//最长回文子序列
//    public int longestPalindromeSubseq(String s) {//6.41%
//        int length = s.length();
//        String t = new StringBuilder(s).reverse().toString();
//        int[][] dp = new int[length+1][length+1];
//        int max = 0;
//        for(int i = 1;i<=length;i++){
//            char a = s.charAt(i-1);
//            for(int j = 1;j<=length;j++){
//                char b = t.charAt(j-1);
//                if(a==b){
//                    dp[i][j] = dp[i-1][j-1]+1;
//                    max = Math.max(dp[i][j],max);
//                }else{
//                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                }
//            }
//        }
//        return max;
//    }
    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        int[][] dp = new int[length+1][length+1];
        int max = 0;
        for(int i = length;i>=1;i--){
            char a = s.charAt(i-1);
            for(int j = i;j<=length;j++){
                char b = s.charAt(j-1);
                if(a==b){
                    if(j-i<=1){
                        dp[i][j] = j-i+1;
                    }else{
                        dp[i][j] = dp[i+1][j-1]+2;
                    }
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    @Test
    public void main() {
        System.out.println(longestPalindromeSubseq("aaaba"));
    }

}

