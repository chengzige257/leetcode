package hard;

import org.testng.annotations.Test;

public class h41 {//缺失的第一个正数
    public int firstMissingPositive(int[] nums) {
        for(int i = 0;i< nums.length;i++){
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if((nums[i]-1)!=i){
                return i+1;
            }
        }
        return nums.length+1;
    }
    @Test
    public void main() {
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
    }
}
