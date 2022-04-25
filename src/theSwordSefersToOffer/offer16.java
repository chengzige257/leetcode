package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer16 {//数值的整数次方
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        long N = n;
        int sign = N>=0?1:-1;
        N = Math.abs(N);
        double sum = pow(x,N);
        return sign==1?sum:1/sum;
    }
    double pow(double x,long n){
        if(n==1)
            return x;
        long half = n/2;
        double num = pow(x,half);
        if(n%2==1){
            return num*num*x;
        }

        return num*num;

    }
    @Test
    public void main() {
//        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(0.44528, 0));
    }
}
