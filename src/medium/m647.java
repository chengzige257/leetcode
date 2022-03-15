package medium;

import org.testng.annotations.Test;

public class m647 {
    public int countSubstrings(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length+1][length+1];
        int count = 0;
        for(int i = length-1;i>=0;i--){
            dp[i+1][i+1] = true;
            count++;
            for(int j = i+1;j<length;j++){
                boolean b = s.charAt(i) == s.charAt(j);
                if(b){
                    if(j-i<=1){
                        count++;
                        dp[i+1][j+1] = true;
                    }else if(dp[i+2][j]){
                        count++;
                        dp[i+1][j+1] = true;
                    }
                }
//                if(j-i<=1){
//                    dp[i+1][j+1] = b;
//                    if(b){
//                        count++;
//                    }
//                }else{
//                    if(b&&dp[i+2][j]){
//                        dp[i+1][j+1] = true;
//                        count++;
//                    }
//                }
            }
        }
        return count;
    }
    @Test
    public void main() {
        System.out.println(countSubstrings("aaaa"));
    }
}
