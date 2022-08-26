package hard;

public class h233 {
    public int countDigitOne(int n) {
        int sum = 0;
        int mulk = 1;
        for(int k = 0;mulk<=n;k++){
            sum+=n/mulk/10*mulk+Math.min(mulk,Math.max(0,n%(mulk*10)-mulk+1));
            mulk=mulk*10;
        }
        return sum;
    }
}
