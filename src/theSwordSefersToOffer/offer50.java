package theSwordSefersToOffer;

public class offer50 {
    public char firstUniqChar(String s) {
        int[] flag = new int[26];
        char cur = ' ';
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int index = c-'a';
            flag[index]++;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c-'a';
            if(flag[index]==1){
                return c;
            }
        }
        return cur;
    }
}
