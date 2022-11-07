package easy;

public class easy268 {//
//    丢失的数字
    public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        for (int num : nums) {
            sum-=num;
        }
        return sum;
    }
}
