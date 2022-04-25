package easy;

public class easy367 {//有效的完全平方数
    public boolean isPerfectSquare(int num) {
//        if (x > 46340 * 46340)
//            return 46340;
//        //0,32768(2的15次方),1073741824(2的30次方)
//        int i = 0;
//        int j = 46340;
//        while (i <= j) {
//            int m = (i + j) / 2;
//            int sum = m * m;
//            if (num > x) {
//                j = m-1;
//            } else if (num < x) {
//                i = m+1;
//            } else {
//                return m;
//            }
//        }
//        return j;
        int i = 1;
        int j = 46340;
        while(i<=j){
            int m = (i+j)/2;
            int number = m*m;
            if(number>num){
                j=m-1;
            }else if(number<num){
                i = m+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
