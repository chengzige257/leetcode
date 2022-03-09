import org.testng.annotations.Test;

public class easy242 {//有效的字母异位词
    public boolean isAnagram(String s, String t) {//66%
        if(s.length()!=t.length())
            return false;
        char[] chars = new char[26];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(chars[t.charAt(i)-'a']==0)
                return false;
            --chars[t.charAt(i)-'a'];
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {100%
//        if(s.length()!=t.length())
//            return false;
//        char[] chars = new char[26];
//        for(char ch : s.toCharArray()){
//            chars[ch-'a']++;
//        }
//        for(char ch : t.toCharArray()){
//            if(chars[ch-'a']==0)
//                return false;
//            --chars[ch-'a'];
//        }
//        return true;
//    }
//    public boolean isAnagram(String s, String t) {100%
//        if (s.toCharArray().length != t.toCharArray().length) return false;
//        int[] nums = new int[26];
//        for (char chr : s.toCharArray()){
//            nums[chr - 'a']++;
//        }
//
//        for (char chr : t.toCharArray()){
//            if (nums[chr - 'a'] == 0){
//                return false;
//            }
//            nums[chr - 'a']--;
//        }
//        return true;
//    }
    @Test
    public void main() {
        System.out.println(isAnagram("acbc","cbac"));
    }
}
