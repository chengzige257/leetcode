package easy;

import org.testng.annotations.Test;

public class easy6 {//Z字形变换
    //我的方法
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        StringBuilder ret = new StringBuilder("");
        int d;
        int current;
        char[] chars = s.toCharArray();
        int length = chars.length;
        for(int i=0;i<numRows;i++){
            current = i;
            while(current<length){

                ret.append(chars[current]);
                if(i!=0&&i!=(numRows-1)){
                    d=2*numRows-2-i*2;
                    if(current+d>=length)
                        break;
                    ret.append(chars[current+d]);
                }
                current = current+2*numRows-2;

            }
        }
        return ret.toString();
    }
    @Test
    public void test() {
        System.out.println(convert("ABC", 3));
    }
}
