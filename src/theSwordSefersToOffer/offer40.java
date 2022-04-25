package theSwordSefersToOffer;

import java.util.Arrays;
import java.util.PriorityQueue;

public class offer40 {//最小的k个数
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);
    }
}
