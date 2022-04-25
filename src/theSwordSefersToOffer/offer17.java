package theSwordSefersToOffer;

public class offer17 {
    //打印出最大的n位数
    public int[] printNumbers(int n) {
        int end = 1;
        for(int i = 1;i<=n;i++){
            end = end * 10;
        }
        int[] res = new int[end-1];

        for(int i = 1;i<end;i++){
            res[i-1] = i;
        }
        return res;
    }
}
