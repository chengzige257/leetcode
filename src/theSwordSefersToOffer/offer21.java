package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer21 {//调整数组顺序使奇数位于偶数前面
    public int[] exchange(int[] nums) {
        int count=0;
        int length = nums.length;
        for (int num : nums) {
            if(num%2==0){
                count++;
            }
        }
        int med = length-count;
        int pre = 0;
        while(pre<length-count&&med<length){

            if(nums[pre]%2==0&&nums[med]%2==1){
                int t = nums[pre];
                nums[pre] = nums[med];
                nums[med] = t;
            }
            if(nums[pre]%2==1){
                pre++;
            }
            if(nums[med]%2==0){
                med++;
            }
        }
        return nums;
    }
    @Test
    public void main() {
        int[] a = new int[]{2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
        exchange(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
