package easy;

import org.testng.annotations.Test;

public class easy674 {
    //最长连续递增序列

    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int current=1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                current++;
            else
                current=1;
            max = Math.max(max,current);
        }
        return max;
    }

    @Test
    public void main() {
        System.out.println(findLengthOfLCIS(new int[]{2,2,2,2}));
    }
}
