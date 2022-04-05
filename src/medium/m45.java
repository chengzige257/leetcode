package medium;

import org.testng.annotations.Test;


public class m45 {//跳跃游戏Ⅱ

    public int jump(int[] nums) {
        int end = nums.length - 1;
        int index = 0;
        int count = 0;
        while (index < end) {

            int max = 0;
            int maxI = 1;

            for (int i = 1; i <= nums[index]; i++) {
                if (index + i <= end && nums[index + i] + i >= max) {
                    max = nums[index + i] + i;
                    maxI = i;
                }
            }
            if(index+nums[index]>=end){
                return ++count;
            }
            index = index + maxI;
            count++;
        }
        return count;
    }

    @Test
    public void main() {
        System.out.println(jump(new int[]{3, 2, 1}));
        System.out.println(jump(new int[]{2, 3, 1}));
    }
}
