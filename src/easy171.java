import org.testng.annotations.Test;

public class easy171 {//Excel表序列号


    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            sum= (int) (sum+(columnTitle.charAt(i)-'A'+1)*Math.pow(26,columnTitle.length()-1-i));
        }
        return sum;
    }
    @Test
    public void main() {
        System.out.println(titleToNumber("AB"));
    }
}
