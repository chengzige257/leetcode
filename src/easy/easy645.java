package easy;

import org.testng.annotations.Test;

public class easy645 {//错误的集合

    public int[] findErrorNums(int[] nums) {
        int copy=0;
        int lack;
        int length = nums.length;
        int s = (1+length)*length/2;
        int sum = 0;
        int[] arr = new int[length+1];
        for(int i=0;i<=length-1;i++){
            sum = sum + nums[i];
            if(arr[nums[i]]==1){
                copy = nums[i];
            }
            arr[nums[i]]++;
        }
        lack = copy + s-sum;
        return new int[]{copy,lack};
    }

    @Test
    public void main() {
        int[] errorNums = findErrorNums(new int[]{1, 2, 2, 3});
        for (int errorNum : errorNums) {

            System.out.println(errorNum);
        }
    }
}
