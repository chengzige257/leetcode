package easy;

public class easy231 {//2的幂
    public boolean isPowerOfTwo(int n) {
        return (n>0)&&((n&(n-1))==0);//1000&0111是0
    }
}
