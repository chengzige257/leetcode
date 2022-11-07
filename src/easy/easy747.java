package easy;

import org.testng.annotations.Test;

public class easy747 {//至少是其他数字的两倍的最大数
    public int dominantIndex(int[] nums) {

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                index = i;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return max1>=2*max2?index:-1;
    }

    @Test
    public void main() {
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
    }



}
