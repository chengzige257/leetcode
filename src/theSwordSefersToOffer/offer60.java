package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class offer60 {
    public static String subZeroAndDot(String s) {
        if (s.indexOf(".") > 0) {
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }
    //n个塞子的点数

    public double[] dicesProbability(int n) {
        if(n <= 0){
            return new double[]{};
        }
        double[][] dp = new double[n + 1][6 * n + 1];
        for(int i = 1;i <= 6;i++){
            dp[1][i] = (double)1 / 6;
        }
        for(int i = 2;i <= n;i++){
            int maxSum = 6 * i;
            for(int j = i;j <= maxSum;j++){
                for(int k = 1;k <=6;k++){
                    if(j <= k){
                        continue;
                    }
                    dp[i][j] += dp[1][k] * dp[i - 1][j - k];
                }
            }
        }
        double[] res = new double[5 * n + 1];
        int value = n;
        for(int i = 0;i < res.length;i++){
            res[i] = dp[n][value++];
        }
        return res;
    }
    @Test
    public void main() {
        System.out.println(Arrays.toString(dicesProbability(4)));

    }

}
