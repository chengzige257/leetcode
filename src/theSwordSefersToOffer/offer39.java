package theSwordSefersToOffer;

import java.util.Arrays;

public class offer39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
