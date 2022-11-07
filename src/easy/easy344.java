package easy;

import org.testng.annotations.Test;

public class easy344 {//反转字符串
    public void reverseString(char[] s) {
        char a;
        for(int i=0,j=s.length-1;i<j;i++,j--){
            a=s[i];
            s[i]=s[j];
            s[j]=a;
        }
    }


    @Test
    public void main() {

    }
}
