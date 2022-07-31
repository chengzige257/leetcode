package medium;

public class m31 {//下一个排列
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length<=1)
            return;
        int length = nums.length;
        int pre = nums[length-1];
        int[] array = new int[101];
        array[pre]++;
        int i;
        for(i = length-2;i>=0;i--){
            if(nums[i]<pre)
                break;
            pre = nums[i];
            array[pre]++;
        }
        if(i>=0)
            for(int j = nums[i]+1;j<=100;j++){
                if(array[j]!=0){
                    array[nums[i]]++;
                    array[j]--;
                    nums[i] = j;
                    break;
                }
            }
        i++;
        int k = 0;
        while(k<=100){
            if(array[k]!=0){
                nums[i++] = k;
                array[k]--;
            }else{
                k++;
            }
        }
    }
}
