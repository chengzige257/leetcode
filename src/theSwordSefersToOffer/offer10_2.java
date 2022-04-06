package theSwordSefersToOffer;

public class offer10_2 {
    public int numWays(int n) {
        if(n==0)
            return 1;
        if(n<=2)
            return n;
        int[] ints = new int[n+1];
        ints[1] = 1;
        ints[2] = 2;
        for(int i = 3;i<=n;i++){
            ints[i] = (ints[i-1]+ints[i-2])%1000000007;
        }
        return ints[n];
    }
}
