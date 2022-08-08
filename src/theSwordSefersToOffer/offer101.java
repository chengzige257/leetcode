package theSwordSefersToOffer;

public class offer101 {
    public boolean canPartition(int[] nums) {
        int num = 0;
        int length = nums.length;
        for(int i = 0;i<=length-1;i++){
            num += nums[i];
        }
        if(num%2==1){
            return false;
        }
        int target = num/2;
        int[] arr = new int[target+1];
//        for(int i = nums[0];i<=target;i++){
//            arr[i] = nums[0];
//        }
        for(int i = 0;i<length;i++){
            for(int j = target;j>=nums[i];j--){
                arr[j] = Math.max(arr[j],arr[j-nums[i]]+nums[i]);
                if(arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
