package easy;

import org.testng.annotations.Test;

public class easy414 {//第三大的数

    public int thirdMax(int[] nums) {
        int temp;

        int count = 0;
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            int maxIndex = i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]>max){
                    max = nums[j];
                    maxIndex=j;
                }
            }
            temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
            if(count==0||nums[i]!=nums[i-1]){
                count++;
                if(count==3)
                    return nums[i];
            }
        }
        return nums[0];
    }
    @Test
    public void main() {
        System.out.println(thirdMax(new int[]{-2147483648, 1, 1}));
    }

}
