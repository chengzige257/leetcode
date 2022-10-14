package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class offer57 {
    //和为s的两个数字
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length-1;
        int i = 0;
        while(i<j&&nums[j]+nums[i]!=target){
            while(nums[j]+nums[i]>target){
                j--;
            }
            while(nums[j]+nums[i]<target){
                i++;
            }
        }
        return new int[]{nums[i],nums[j]};
    }
    @Test
    public void main() {
        System.out.println(Arrays.toString(twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40)));
    }
}
