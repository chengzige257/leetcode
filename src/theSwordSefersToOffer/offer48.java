package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer48 {//最长不含重复字符的子字符串
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
            return 1;
        int max = 0;
        int length = s.length();
        int[] array = new int[128];
        for(int i = 0,j = 0;j<length;j++){
            char c = s.charAt(j);
            i = Math.max(i,array[c]);
            array[c] = j+1;
            max = Math.max(max,j-i+1);
        }
        return max;
    }
    @Test
    public void main() {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
