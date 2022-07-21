package medium;

import org.testng.annotations.Test;

public class m33 {
    @Test
    public void main(){
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    public int search(int[] nums, int target) {
        if(nums.length==1)
            return target==nums[0]?0:-1;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int med = left+(right-left)/2;
            boolean array1 = nums[left]<=nums[med];
            boolean array2 = nums[med+1]<=nums[right];
            if(array1&&!array2){
                int flag = searchOrder(nums,target,left,med);
                if(flag==-2||flag>=0)
                    return flag==-2?-1:flag;
                left = med+1;
                continue;
            }
            if(!array1&&array2){
                int flag = searchOrder(nums,target,med+1,right);
                if(flag==-2||flag>=0)
                    return flag==-2?-1:flag;
                right = med;
                continue;
            }
            int flag = searchOrder(nums,target,left,med);
            if(flag==-2||flag>=0)
                return flag==-2?-1:flag;
            flag = searchOrder(nums,target,med+1,right);
            return flag==-2?-1:flag;
        }
        return -1;
    }
    public int searchOrder(int[] nums, int target,int left,int right){
        if(target<nums[left]||target>nums[right])
            return -1;
        int med = left+(right-left)/2;
        while(left<=right){
            if(nums[med]>target){
                right=med-1;
            }else if(nums[med]<target){
                left = med+1;
            }else{
                return med;
            }
            med = left+(right-left)/2;
        }
        return -2;
    }
}
