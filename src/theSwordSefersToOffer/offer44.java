package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer44 {
    public int findNthDigit(int n) {
        int k = 1;
        int count = 9;
        while(n-count>0){
            n = n-count;
            k++;
            count = (int) (Math.pow(10,k-1)*9*k);
        }
        int init = (int) Math.pow(10,k-1);
        int plus = (n-1)/k;
        int num = init+plus;
        int i = n%k;
        if(i==0)
            i = k;
        return (int) (num/Math.pow(10,k-i))%10;
    }
    @Test
    public void main() {
        System.out.println(findNthDigit(0));
        System.out.println(findNthDigit(1));
        System.out.println(findNthDigit(2));
        System.out.println(findNthDigit(3));
    }
}
