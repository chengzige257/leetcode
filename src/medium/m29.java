package medium;

import org.testng.annotations.Test;

public class m29 {
//    public int divide(int dividend, int divisor) {
//        if(dividend==Integer.MIN_VALUE)
//            return Integer.MAX_VALUE;
//        return dividend/divisor;
//    }
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE&&divisor==1)
            return Integer.MIN_VALUE;
        boolean flag = false;
        if(dividend>0&&divisor>0||dividend<0&&divisor<0)
            flag = true;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int count=0;
        int num = 1;
        while(dividend<0&&num>0){
            if(dividend - divisor>0){
                num = num/2;
                divisor = divisor/2;
                continue;
            }
            dividend = dividend - divisor;
            count = count + num;
            if(Integer.MIN_VALUE/2<=divisor){
                num = num*2;
                divisor = divisor*2;
            }

        }
        return flag?count:-count;
    }

    @Test
    public void main() {
//        int a = -2147483648;
//        System.out.println(-a);
//        System.out.println(Math.abs(-11));

          System.out.println(divide(1100540749,-1090366779));
//        System.out.println(Math.pow(2,31));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(-1090366779*2);
//        System.out.println(1090366779*2);
    }


}
