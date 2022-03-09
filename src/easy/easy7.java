import org.testng.annotations.Test;

public class easy7 {
    public int reverse(int x) {
        int res=0;
        while(x!=0){
            res=res*10+x%10;
            x/=10;
            if(res>214748364||res<-214748364)
                return 0;
        }
        return res;
    }

    @Test
    public void main() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
