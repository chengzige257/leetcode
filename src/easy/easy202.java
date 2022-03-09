import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class easy202 {//快乐树
//    public boolean isHappy(int n) {
//        if(n==1)
//            return true;
//        Set<Integer> set = new HashSet<>();
//
//        while(set.add(n)){
//            int sum = 0;
//            while(n!=0){
//                int pop = n%10;
//                n=n/10;
//                sum = sum+pop*pop;
//            }
//            if(sum==1)
//                return true;
//            n=sum;
//        }
//        return false;
//    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {//快慢指针
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    @Test
    public void main() {
        System.out.println(isHappy(19));
    }

}
