package medium;

import org.testng.annotations.Test;

public class m718 {//最长重复子数组,连续的
//    public int findLength(int[] nums1, int[] nums2) {//97%
//        int m = nums1.length;
//        int n = nums2.length;
//        int[][] dp = new int[m+1][n+1];
//        int max = 0;
//        for(int i = 0;i<m;i++){
//            for(int j = 0;j<n;j++){
//                if(nums1[i]==nums2[j]){
//                    dp[i+1][j+1]=dp[i][j]+1;
//                    max = Math.max(max,dp[i+1][j+1]);
//                }
//            }
//        }
//        return max;
//    }
    public int findLength(int[] nums1, int[] nums2){//80%
        int m = nums1.length;
        int n = nums2.length;
        int[] dp = new int[n+1];
        int max = 0;
        for(int i = 0;i<m;i++){
            for(int j = n-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    dp[j+1] = dp[j]+1;
                    max = Math.max(max,dp[j+1]);
                }else
                    dp[j+1] = 0;
            }
        }
        return max;
    }

    @Test
    public void main() {
        System.out.println(findLength(new int[]{1,2,3,4}, new int[]{1,5,3,4}));
    }
}
