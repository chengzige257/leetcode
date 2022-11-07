package easy;

import org.testng.annotations.Test;

public class easy168 {//Excel表列名称
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder("");
        while(columnNumber!=0){
            int pop = columnNumber%26;
            if(pop==0)
                sb.append('Z');
            else
                sb.append((char) ('A'+pop-1));
            columnNumber = columnNumber/26;
            if(pop==0)
                columnNumber--;
        }
        return sb.reverse().toString();
    }
    @Test
    public void main() {
        System.out.println(convertToTitle(26*26+26+2));//AAB
        System.out.println(convertToTitle(26*26+26));//ZZ
        System.out.println(convertToTitle(26));//Z
        System.out.println(convertToTitle(27));//AA
        System.out.println(convertToTitle(1));//A
    }
}
