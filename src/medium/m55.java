package medium;

import org.testng.annotations.Test;

public class m55 {//跳跃游戏
    public boolean canJump(int[] nums) {//17%
        int index = 0;
        int end = nums.length-1;
        while(index<end){
            int max = 0;
            int maxI = 0;
            for(int i = 1;i<=nums[index];i++){
                if(index+i<=end&&nums[index+i]+i>=max){
                    max = nums[index+i]+i;
                    maxI = i;
                }
            }
            if(maxI==0)
                return false;
            if(index+maxI>=end){
                return true;
            }
            index = index+maxI;
        }
        return true;
    }


//    public boolean canJump(int[] nums) {
//        int n = nums.length;
//        int rightmost = 0;
//        for (int i = 0; i < n; ++i) {
//            if (i <= rightmost) {
//                rightmost = Math.max(rightmost, i + nums[i]);
//                if (rightmost >= n - 1) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    @Test
    public void main() {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
}
