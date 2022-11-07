package easy;

import org.testng.annotations.Test;

public class easy35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int med = (left+right)/2;
        while(left!=right){
            if(nums[med]==target)
                return med;
            else if(nums[med]>target){
                right = med;
            }else{
                left = med+1;
            }
            med = (left+right)/2;
        }
        if(nums[med]>=target)
            return med;
        else
            return med+1;
    }


    @Test
    public void main() {
        int[] a = new int[]{1,2,3};
        System.out.println(searchInsert(a,2));
     }
}
