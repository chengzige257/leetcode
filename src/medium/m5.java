package medium;

import org.testng.annotations.Test;

public class m5 {//最长回文子串

    public String longestPalindrome(String s){
        String ss = preprocess(s);
        int length = ss.length();
        int[] arr = new int[length];
        int center = 0;
        int radius = 0;
        int max = 0;
        int index = 0;
        for(int i = 2;i<=length-2;i++){
            if(i<center+radius){
                arr[i] = Math.min(arr[2*center-i],center+radius-i);
            }
            while(ss.charAt(i-arr[i]-1)==ss.charAt(arr[i]+i+1)){
                arr[i]++;
            }
            if(i+arr[i]>center+radius){
                center = i;
                radius = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return s.substring((index-max)/2,(index-max)/2+max);
    }

    String preprocess(String s){
        StringBuilder stringBuffer = new StringBuilder("^");
        for(int i = 0;i<s.length();i++){
            stringBuffer.append('*').append(s.charAt(i));
        }
        return stringBuffer.append('*').append('$').toString();
    }

    @Test
    public void main() {
        System.out.println(longestPalindrome("abcedde"));
    }
}
