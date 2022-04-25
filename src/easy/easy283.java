package easy;

import org.testng.annotations.Test;

public class easy283 {//移动零
    public void moveZeroes(int[] nums) {
        int top = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=top){
                    int temp = nums[top];
                    nums[top] = nums[i];
                    nums[i] = temp;
                }
                top++;
            }
        }
    }
    @Test
    public void main() {
        int[] a = new int[]{0,1,0,3,12};
        moveZeroes(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
