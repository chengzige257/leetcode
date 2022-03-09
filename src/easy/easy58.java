import org.testng.annotations.Test;

public class easy58 {//最后一个单词的长度
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int end = s.length();
        int start = end-1;
        while(start!=-1&&s.charAt(start)!=' '){
            start--;
        }
        return end-1-start;
    }
    @Test
    public void tesy(){
        System.out.println(lengthOfLastWord("avxha dxas bxhas cas      "));
    }
}
