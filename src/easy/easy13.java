import org.testng.annotations.Test;

public class easy13 {
    //罗马数字转整数
    //字符          数值
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    public int romanToInt(String s) {
        int res = 0;
        if(s.length()==0)
            return res;
        for(int i=0;i<s.length()-1;i++){
            int cur = getVal(s.charAt(i));
            int next = getVal(s.charAt(i+1));
            if(cur<next)
                res-=cur;
            else
                res+=cur;
        }
        return res+getVal(s.charAt(s.length()-1));
    };
    public int getVal(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        throw new IllegalArgumentException("unsupported character");
    }
    @Test
    public void main() {
        System.out.println(romanToInt("MDC"));
    }
}
