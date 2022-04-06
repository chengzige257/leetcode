package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer05 {//替换空格
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = s.replaceAll(" ", "%20");
        return s1;
    }
    @Test
    public void main() {
        String s = replaceSpace("  ");
        System.out.println(s);
    }
}
