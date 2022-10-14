package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class offer66 {
    //构建乘积数组
    public int[] constructArr(int[] a) {
        int n = a.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= a[i], i++)       /* 从左往右累乘 */
            B[i] = product;
        for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--)  /* 从右往左累乘 */
            B[i] *= product;
        return B;
    }
    @Test
    public void main() {
        System.out.println(Arrays.toString(constructArr(new int[]{1, 2, 3, 4, 5})));
    }
}
