package medium;

import org.testng.annotations.Test;

public class m38 {
    //外观数列
    public String countAndSay(int n) {
        StringBuilder stringBuilder = new StringBuilder("1");
        for(int i = 2;i<=n;i++){
            stringBuilder = next(stringBuilder);
        }
        return stringBuilder.toString();
    }
    public StringBuilder next(StringBuilder stringBuilder){
        char lastChar = stringBuilder.charAt(0);
        int count = 1;
        int length = stringBuilder.length();
        stringBuilder.deleteCharAt(0);
        for(int i = 1;i<length;i++){
            if(stringBuilder.charAt(0)!=lastChar){
                stringBuilder.append(count).append(lastChar);
                count = 1;
                lastChar = stringBuilder.charAt(0);
            }else
                count++;
            stringBuilder.deleteCharAt(0);
        }
        stringBuilder.append(count).append(lastChar);
        return stringBuilder;
    }

    @Test
    public void main() {
        String s = countAndSay(4);
        System.out.println(s);
    }
}
