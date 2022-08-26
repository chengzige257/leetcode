package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer46 {
    public int translateNum(int num) {//把数字翻译成字符串
        if(num<=9)
            return 1;
        int length = (int)Math.log10(num)+1;
        int[] ints = new int[1];
        function(ints,length, num);
        return ints[0];
    }

    void function(int[] count, int left, int num){
        if(left<=1){
            count[0]++;
            return;
        }
        if(num%100<=25&&num%100>=10){
            function(count,left-2, num/100);
        }
        function(count,left-1, num/10);
    }
    @Test
    public void main() {
        System.out.println(translateNum(506));
    }
}
