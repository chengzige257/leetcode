package easy;

import org.testng.annotations.Test;

public class easy392 {
    //判断子序列


//    public boolean isSubsequence(String s, String t) {//10%
//        int sLength = s.length();
//        int tLength = t.length();
//        if (s.length() > t.length())
//            return false;
//        int[] a = new int[tLength];
//        int[] b = new int[tLength];
//        int max = 0;
//        for (int i = 0; i < sLength; i++) {
//            for (int j = 0; j < tLength; j++) {
//                if(s.charAt(i)==t.charAt(j)){
//                    if(i==0||j==0)
//                        a[j]=1;
//                    else
//                        a[j]=b[j-1]+1;
//                }else{
//                    if(i==0||j==0){
//                        if(j==0)
//                            a[j]=Math.max(0,b[j]);
//                        else
//                            a[j]=Math.max(0,a[j-1]);
//                    }
//                    else
//                        a[j]=Math.max(a[j-1],b[j]);
//                }
//                if(a[j]>max)
//                    max = a[j];
//            }
//            System.arraycopy(a, 0, b, 0, tLength);
//        }
//        return max==sLength;
//    }

//    public boolean isSubsequence(String s, String t) {//%87
//        int n = s.length(), m = t.length();
//        int i = 0, j = 0;
//        while (i < n && j < m) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++;
//            }
//            j++;
//        }
//        return i == n;
//    }
//    public boolean isSubsequence(String s, String t) {//100%
//        int index = -1;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            int temp = t.indexOf(c,index + 1);
//            if(temp == -1) {
//                return false;
//            }else {
//                index = temp;
//            }
//        }
//        return true;
//    }
    public boolean isSubsequence(String s, String t) {//11%
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for(int i = 1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j]>max)
                        max = dp[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return max==s.length();
    }

    @Test
    public void main() {
        System.out.println("abcdef".indexOf('b',2));
    }

}
