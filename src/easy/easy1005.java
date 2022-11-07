package easy;

import org.testng.annotations.Test;

import java.util.Arrays;

public class easy1005 {
    //    public int largestSumAfterKNegations(int[] nums, int k) {
//        PriorityQueue<Integer> fuShu = new PriorityQueue<>();
//        PriorityQueue<Integer> zhengShu = new PriorityQueue<>();
//        int sum = 0;
//        for (int j : nums) {
//            sum += j;
//            if (j >= 0)
//                zhengShu.add(j);
//            else
//                fuShu.add(j);
//        }
//        for (int i = 1; i <= k; i++){
//            if(!fuShu.isEmpty()){
//                int num = fuShu.poll();
//                num = -num;
//                zhengShu.add(num);
//                sum+=num*2;
//                continue;
//            }
//            if(!zhengShu.isEmpty()){
//                int num = zhengShu.poll();
//                num = -num;
//                fuShu.add(num);
//                sum+=num*2;
//            }
//        }
//        return sum;
//    }
    int cmp(int a,int b){
        b=Math.abs(b);
        if(a>b)
            return b;
        return a;
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = cmp(min, num);
            if (k > 0 && num < 0) {
                sum += Math.abs(num);
                k--;
                continue;
            }
            sum += num;
        }
        if(k%2==0)
            return sum;
        return sum-min*2;
    }

    @Test
    public void main() {
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3}, 1));
    }
}
