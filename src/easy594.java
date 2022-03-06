import org.testng.annotations.Test;

import java.util.Arrays;

public class easy594 {//最长和谐子序列

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int pre = 0;
        int p = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[pre]+1&&(i+1==nums.length||nums[i]!=nums[i+1])){
                if(i - pre + 1>max)
                    max = i - pre + 1;
                pre = p;
            }else if(nums[i]-nums[pre]>1){
                pre = p;
            }

            if(i+1!=nums.length&&nums[i]!=nums[i+1]){
                p = i+1;
            }
        }
        return max;
    }

    @Test
    public void main() {
//        int lhs = findLHS(new int[]{-3,-1,-1,-1,-3,-2});
        int lhs = findLHS(new int[]{1,3,2,2,5,2,3,7});
        System.out.println(lhs);
    }
}
