package easy;

public class easy509 {//斐波那契数列
    public int fib(int n) {
        if(n<=1)
            return n;
        int prepre = 0;
        int pre = 1;
        int p;
        for(int i=2;i<=n;i++){
            p=pre+prepre;
            prepre = pre;
            pre = p;
        }
        return pre;
    }


}
