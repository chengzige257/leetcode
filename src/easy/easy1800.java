package easy;

public class easy1800 {
    public int maxAscendingSum(int[] nums) {//最大升序子数组
        int length = nums.length;
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1;i<length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
