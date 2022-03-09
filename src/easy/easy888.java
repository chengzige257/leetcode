import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class easy888 {//公平的糖果交换

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int aliceSize : aliceSizes) {
            sum1+=aliceSize;
        }
        for (int bobSize : bobSizes) {
            sum2+=bobSize;
        }
        Set<Integer> set = new HashSet<>();
        int c= (sum1-sum2)/2;
        for (int aliceSize : aliceSizes) {
            set.add(aliceSize);
        }
        for (int bobSize : bobSizes) {
            if(set.contains(c+bobSize)){
                return new int[]{c+bobSize,bobSize};
            }
        }
        return new int[]{1,1};
    }

    @Test
    public void main() {
        int[] ints = fairCandySwap(new int[]{2}, new int[]{1, 3});
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
