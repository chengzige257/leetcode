package easy;

import org.testng.annotations.Test;

public class easy389 {
    //找不同
//    public char findTheDifference(String s, String t) {
//        int[] chars =new int[26];
//        for(int i=0;i<t.length();i++){
//            char c = t.charAt(i);
//            chars[c-'a']++;
//        }
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(chars[c-'a']==0)
//                return c;
//            chars[c-'a']--;
//        }
//        for(int i=0;i<26;i++){
//            if(chars[i]==1){
//                return (char) ('a'+i);
//            }
//        }
//        return 'a';
//    }
    public char findTheDifference(String s, String t) {//求和
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }

    @Test
    public void main() throws Exception {
        System.out.println(findTheDifference("abcde", "abcd"));
    }
}
