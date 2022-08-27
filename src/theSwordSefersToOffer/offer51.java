package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer51 {
    public int reversePairs(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length];
        return sort(nums,0,length-1,temp);
    }

    private int sort(int[] nums, int start, int end, int[] temp) {
        if(start>=end)
            return 0;
        int mid = start+(end-start)/2;
        int left = sort(nums,start,mid,temp);
        int right = sort(nums,mid+1,end,temp);
        return left+right+function(nums,temp,start,mid,end);
    }

    private int function(int[] nums, int[] temp, int start, int mid, int end) {
        int count = 0;
        if (end + 1 - start >= 0) System.arraycopy(nums, start, temp, start, end + 1 - start);
        int i = start;
        int j = mid+1;
        int k = start;
        while(i<=mid||j<=end){
            if(j>end){
                nums[k++] = temp[i++];
            }else if(i>mid){
                nums[k++] = temp[j++];
                count = count+(mid-i+1);
            }else if(temp[i]<=temp[j]){
                nums[k++] = temp[i++];
            } else{
                nums[k++] = temp[j++];
                count = count+(mid-i+1);
            }
        }
        return count;
    }
    @Test
    public void main() {
        System.out.println(reversePairs(new int[]{7, 5, 6, 4}));

    }
}
