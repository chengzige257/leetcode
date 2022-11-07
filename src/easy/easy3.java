package easy;

import org.testng.annotations.Test;

public class easy3 {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int[] index = new int[128];
        int max=0;
        for(int i=0,j=0;j<length;j++){
            i = Math.max(i,index[s.charAt(j)]);
            index[s.charAt(j)] = j+1;
            max = Math.max(max,j-i+1);
        }
        return max;
    }

    @Test
    public void main(){
        System.out.println(lengthOfLongestSubstring("aadd"));
    }
}
