package easy;

import org.testng.annotations.Test;

public class easy28 {//实现strStr()
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    @Test
    public void test(){
        System.out.println(strStr("abcdef","bcdef"));
    }
}
