package easy;

public class easy704 {//二分查找
    public int search(int[] nums, int target) {
        int length = nums.length;
        int i = 0;
        int j = length-1;

        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]<target){
                i = m+1;
            }else if(nums[m]>target){
                j = m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
