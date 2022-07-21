package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class m43 {//字符串相乘
    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        char[] charNum1 = num1.toCharArray();
        char[] charNum2 = num2.toCharArray();
        if("0".equals(num1)||"0".equals(num2))
            return "0";
        int[] array = new int[length1+length2];
        int length = length1+length2;
        for(int i = 0;i<length1;i++){
            for(int j = 0;j<length2;j++){
                array[i+j+1] += (charNum1[i]-48) * (charNum2[j]-48);
            }
        }
        char[] chars = new char[length];
        for(int i = length-1;i>0;i--){
            array[i-1] = array[i]/10+array[i-1];
            array[i] = array[i]%10;
            array[i] = array[i] + 48;
            chars[i] = (char) array[i];
        }
        array[0] = array[0] +48;
        chars[0] = (char)array[0];
        return chars[0]=='0'?String.valueOf(chars,1,length-1):String.valueOf(chars);
    }
    @Test
    public void main(){
        System.out.println(multiply("2", "3"));
    }
}
