package easy;

import org.testng.annotations.Test;

public class easy69 {//x的平方根

    public int mySqrt(int x) {

        if (x > 46340 * 46340)
            return 46340;
        //0,32768(2的15次方),1073741824(2的30次方)
        int i = 0;
        int j = 46340;
        while (i <= j) {
            int m = (i + j) / 2;
            int num = m * m;
            if (num > x) {
                j = m-1;
            } else if (num < x) {
                i = m+1;
            } else {
                return m;
            }
        }
        return j;
    }

    @Test
    public void main() {
        System.out.println(mySqrt(8));
    }
}
