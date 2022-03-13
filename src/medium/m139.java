package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m139 {//单词拆分
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length+1];
        dp[0] = true;
        for(int i = 0;i<=length;i++){
            for (String s1 : wordDict) {
                if(i>=s1.length()){
                    dp[i] = s.substring(i-s1.length(), i).equals(s1) &&dp[i-s1.length()];
                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[length];
    }
    @Test
    public void main() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("pen");
        System.out.println(wordBreak("applepenappe", strings));
    }
}
