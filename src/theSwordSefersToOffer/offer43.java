package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class offer43 {

    public int countDigitOne(int n) {
        int sum = 0;
        int mulk = 1;
        for(int k = 0;mulk<=n;k++){
            sum+=n/mulk/10*mulk+Math.min(mulk,Math.max(0,n%(mulk*10)-mulk+1));
            mulk=mulk*10;
        }
        return sum;
    }
    @Test
    public void main() {
        System.out.println(countDigitOne(13));
    }
}
