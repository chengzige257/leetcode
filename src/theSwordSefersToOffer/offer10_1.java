package theSwordSefersToOffer;

public class offer10_1 {//斐波那契数列
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1||n==2)
            return 1;
        int[] ints = new int[n+1];
        ints[1] = ints[2] = 1;
        for(int i = 3;i<=n;i++){
            ints[i] = (ints[i-1]+ints[i-2])%1000000007;
        }
        return ints[n];
    }
}
