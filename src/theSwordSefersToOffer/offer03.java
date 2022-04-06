package theSwordSefersToOffer;

public class offer03 {//数组中重复的数字
    public int findRepeatNumber(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(flag[nums[i]])
                return nums[i];
            flag[nums[i]] = true;
        }
        return -1;
    }
}
