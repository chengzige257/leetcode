package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class m213 {//打家劫舍Ⅱ

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }

    public int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }


    @Test
    public void main() {
//        int[] a = new int[]{2,2,4,3,2,5};//1,1,3,6,7,10,7,1,8,5,9,1,4,4,3
        int[] a = new int[]{2,1,2,6,1,8,10,10};//1,1,3,6,7,10,7,1,8,5,9,1,4,4,3
        System.out.println(rob(a));
    }
}
