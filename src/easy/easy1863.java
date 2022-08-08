package easy;

import org.testng.annotations.Test;

public class easy1863 {
//    public int subsetXORSum(int[] nums) {//位运算，方法一
//        int sum = 0;
//
//        for(int i = 1;i<(1<<nums.length);i++){
//            int ans = 0;
//            for(int j = 0;j<nums.length;j++){
//                if(((1<<j)&i)!=0){
//                    ans^=nums[j];
//                }
//            }
//            sum+=ans;
//        }
//        return sum;
//    }
    public int subsetXORSum(int[] nums) {//dfs，方法二
        int current = 0;
        int[] sum = new int[1];
        cal(nums,sum,current,0);
        return sum[0];
    }
    public void cal(int[] nums,int[] sum,int current,int a){
        if(current==nums.length){
            sum[0]+=a;
            return;
        }
        cal(nums,sum,current+1,a^nums[current]);
        cal(nums,sum,current+1,a);
    }

    @Test
    public void main(){
//        System.out.println(subsetXORSum(new int[]{1, 2, 3, 4}) == subsetXORSum1(new int[]{1, 2, 3, 4}));
    }


}
