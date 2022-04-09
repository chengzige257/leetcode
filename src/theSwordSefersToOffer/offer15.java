package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer15 {//二进制中1的个数
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0;i < 32;i++){
            if((n&(1 << i) )!=0 ){
                count++;
            }
        }
        return count;
    }

    @Test
    public void main() {
//        System.out.println(hammingWeight());
        System.out.println(1 << 2);
    }

}
