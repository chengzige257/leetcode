package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class m16 {//最接近的三数之和
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int maxClose = nums[1]+nums[0]+nums[2];
        for(int i = 0;i<length;i++){
            int j = i+1;
            int k = length-1;
            while(j<k){
                int curSum = nums[i]+nums[j]+nums[k];
                if(curSum == target)
                    return target;
                if(Math.abs(curSum-target)<Math.abs(maxClose-target))
                    maxClose = curSum;
                if(curSum-target>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return maxClose;
    }
    @Test
    public void main() {
        System.out.println(threeSumClosest(new int[]{-3,-2,-5,3,-4}, 1));
    }
}
