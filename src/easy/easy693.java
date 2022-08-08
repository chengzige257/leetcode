package easy;

public class easy693 {//交替位二进制数
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            if((n&3)==3||(n&3)==0)
                return false;
            n = n>>1;
        }
        return true;
    }
}
