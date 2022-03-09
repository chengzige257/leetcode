import org.testng.annotations.Test;

public class easy67 {//二进制求和
    public String addBinary(String a, String b) {
        if("".equals(a))
            return b;
        if("".equals(b))
            return a;
        int maxLen = Math.max(a.length(),b.length());
        char[] result = new char[maxLen];
        int p = a.length()-1;
        int q = b.length()-1;
        int carry = 0;
        int sum = 0;
        for(int i = maxLen-1;i>=0;i--){
            int ac = p==-1?0:a.charAt(p)-'0';
            int bc = q==-1?0:b.charAt(q)-'0';
            sum = ac+bc+carry;
            carry=sum>=2?1:0;
            result[i] = sum%2==0?'0':'1';
            p=p>=0?p-1:-1;
            q=q>=0?q-1:-1;
        }
        if(carry==1)
            return "1"+(new String(result));
        return new String(result);
    }

    @Test
    public void test(){
        System.out.println(addBinary("1",
                "111"));
        //110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000
    }
}
