package easy;

public class easy342 {//4的幂
    public boolean isPowerOfFour(int n) {
        return ((n & (n - 1)) == 0) && (n % 3 == 1);//2的偶数次（4的次幂）幂除以3余1，2的奇数次幂除以3余2
    }
}
