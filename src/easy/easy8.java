package easy;

import org.testng.annotations.Test;

public class easy8 {
    public int myAtoi(String s) {
        int sum = 0;
        int pop = 0;
        int sign = 1;
        boolean hasSign = false;
        int length = s.length();
        char c;
        for(int i = 0;i<length;i++){
            c = s.charAt(i);
            if(c=='+'&&!hasSign){
                sign = 1;
                hasSign = true;
                continue;
            }
            if(c=='-'&&!hasSign){
                sign = -1;
                hasSign = true;
                continue;
            }
            if(c==' '&&!hasSign){
                continue;
            }
            if(c>='0'&&c<='9') {
                hasSign = true;
                pop = c - '0';
                if(sign*sum>Integer.MAX_VALUE/10||sign*sum==Integer.MAX_VALUE/10&&pop>=7)
                    return Integer.MAX_VALUE;
                if(sign*sum<Integer.MIN_VALUE/10||sign*sum==Integer.MIN_VALUE/10&&pop>=8)
                    return Integer.MIN_VALUE;
                sum = sum*10+pop;
            }else{
                return sign*sum;
            }

        }
        return sign*sum;
    }
    @Test
    public void test() {
        System.out.println("0000+23333");
    }
}
