package medium;

import org.testng.annotations.Test;

public class m209 {
    //长度最小的子数组
    public int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        int begin = 0;
        int end = 0;
        int curSum = nums[0];
        int min = Integer.MAX_VALUE;
        while (true) {
            if (curSum >= target) {
                min = Math.min(min, end - begin + 1);

                curSum = curSum-nums[begin];
                begin = begin + 1;

            } else {
                if(end == length-1){
                    break;
                }
                end = end + 1;
                curSum = curSum+nums[end];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
    @Test
    public void main() {
        System.out.println(minSubArrayLen(11, new int[]{11}));
    }
}
