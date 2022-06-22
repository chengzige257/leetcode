package medium;

import org.testng.annotations.Test;

public class m50 {
    public double myPow(double x, int n) {
        if(n==-2147483648){
            return Math.pow(x,-2147483648);
        }
        if(n<0)
            return 1.0/c(x,-n);
        return c(x,n);
    }

    double c(double x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        int half = n/2;
        int left = n%2;
        if(left==0){
            double y = myPow(x,half);
            return y*y;
        }
        double y = myPow(x,half);
        return x*y*y;
    }
    @Test
    public void main() {
        System.out.println(myPow(2, 10));
    }
}
