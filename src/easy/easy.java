package easy;

public class easy {//位1的个数
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
