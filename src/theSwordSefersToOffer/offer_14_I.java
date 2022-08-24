package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class offer_14_I {//减绳子
    Map<Integer,Integer> map = new HashMap<>();
    public int cuttingRope(int n) {
        int max = 0;
        for(int i = 1;i<=n/2;i++) {

            int left = n - i;
            int cuttingLeft;
            if(map.containsKey(left)){
                cuttingLeft = map.get(left);
            }else{
                cuttingLeft = cuttingRope(left);
                map.put(left,cuttingLeft);
            }
            max = Math.max(max, i * Math.max(cuttingLeft, left));
        }
        return max;
    }
    public int cuttingRope1(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
    @Test
    public void main() {
        System.out.println(cuttingRope(8));
        System.out.println(cuttingRope1(8));
        System.out.println(Integer.MAX_VALUE);
    }

}
