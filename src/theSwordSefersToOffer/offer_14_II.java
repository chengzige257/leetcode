package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class offer_14_II {//减绳子II
    Map<Integer,BigInteger> map = new HashMap<>();
    public int cuttingRope(int n) {
        return cuttingRope1(n).mod(BigInteger.valueOf(1000000007)).intValue();
    }
    public BigInteger cuttingRope1(int n) {
        BigInteger max = BigInteger.valueOf(0);
        for(int i = 1;i<=n/2;i++) {
            int left = n - i;
            BigInteger cuttingLeft;
            if(map.containsKey(left)){
                cuttingLeft = map.get(left);
            }else{
                cuttingLeft = cuttingRope1(left);
                map.put(left,cuttingLeft);
            }
            max = max.max(BigInteger.valueOf(i).multiply(cuttingLeft.max(BigInteger.valueOf(left))));
        }
        return max;
    }


    public int cuttingRope3(int n) {
        BigInteger [] dp=new BigInteger[n+1];
        Arrays.fill(dp,BigInteger.valueOf(1));
        // dp[2]=BigInteger.valueOf(1);

        for(int i=3;i<n+1;i++){
            for(int j=2;j<i;j++){
                dp[i]=dp[i].max(BigInteger.valueOf(j*(i-j))).max((dp[i-j].multiply(BigInteger.valueOf(j))));
            }
        }
        return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }


    @Test
    public void main() {
        System.out.println(cuttingRope(1000));
        System.out.println(cuttingRope3(1000));
    }
}
