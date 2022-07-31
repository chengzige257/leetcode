package week;

import org.testng.annotations.Test;

public class week1_6132 {
    public int minimumOperations(int[] nums) {
        int length = nums.length;
        int count = 0;
        int[] array = new int[101];
        for(int i = 0;i<length;i++){
            if(array[nums[i]]==0)
                count++;
            array[nums[i]]++;
        }
        return array[0]==0?count:count-1;
    }
    @Test
    public void main() {
        System.out.println(minimumOperations(new int[]{0}));
    }
}
