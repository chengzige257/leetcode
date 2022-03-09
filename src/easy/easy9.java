import org.testng.annotations.Test;

import java.util.Map;

public class easy9 {
    //回文数
//    public boolean isPalindrome(int x) {//我的方法
//        String str = String.valueOf(x);
//        for(int i=0;i<=str.length()/2-1;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-1-i))
//                return false;
//        }
//        return true;
//    }

//    public int reverse(int x){//方法二
//        int rev = 0;
//        while(x!=0){
//            rev=rev*10+x%10;
//            x/=10;
//            if(x!=0&&(x>Integer.MAX_VALUE/10||x<Integer.MIN_VALUE/10)){
//                return 0;
//            }
//        }
//        return rev;
//    }
//    public boolean isPalindrome(int x){
//        if(x<0){
//            return false;
//        }
//        return reverse(x)==x;
//    }

//    public boolean isPalindrome(int x){//方法三
//        if(x<0){
//            return false;
//        }
//        if(x==0)
//            return true;
//        int length = (int)(Math.log(x)/Math.log(10))+1;
//        int half = length/2;
//        if(length%2==0){
//            return x/(int)Math.pow(10,half)==reverse((int) (x%(Math.pow(10,half))),half);
//        }
//        return x/((int)Math.pow(10,half+1))==reverse((int) (x%(Math.pow(10,half))),half);
//    }
//
//    public int reverse(int x,int half){
//        int rev = 0;
//        for(int i=1;i<=half;i++){
//            rev = rev*10+x%10;
//            x/=10;
//        }
//        return rev;
//    }

    public boolean isPalindrome(int x){//方法四
        if(x<0)
            return false;
        int digital = (int)(Math.log(x)/Math.log(10)+1);
        int revert = 0;
        int pop = 0;
        for(int i=0;i<digital/2;i++){
            pop = x%10;
            revert = revert*10 + pop;
            x/=10;
        }
        if(digital%2 == 0 && x == revert)
            return true;
        if(digital%2!=0 && x/10==revert)
            return true;
        return false;
    }
    @Test
    public void main() {
        System.out.println(isPalindrome(0));
    }

}


