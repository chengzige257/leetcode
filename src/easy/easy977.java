package easy;

import org.testng.annotations.Test;

public class easy977 {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        if(length==1)
            return new int[]{nums[0]*nums[0]};
        int j = 1;
        while(nums[j]<0){
            j++;
            if(j==length)
                break;
        }
        int i = j-1;
        int count = 0;
        int[] res = new int[length];
        while(count<length){
            if(i==-1){
                res[count++] = nums[j]*nums[j];
                j++;
                continue;
            }
            if(j==length){
                res[count++] = nums[i]*nums[i];
                i--;
                continue;
            }
            if(-nums[i]<nums[j]){
                res[count++]=nums[i]*nums[i];
                i--;
            }else{
                res[count++] = nums[j]*nums[j];
                j++;
            }
        }
        return res;
    }

    @Test
    public void main() {
        int[] ints = sortedSquares(new int[]{-7, -3, -2, -1});
        int[] ints1 = sortedSquares(ints);
        for (int i : ints1) {
            System.out.println(i);
        }
    }
}
