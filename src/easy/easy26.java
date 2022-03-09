import org.testng.annotations.Test;

public class easy26 {//删除有序数组中的重复项
    public int removeDuplicates(int[] nums) {
        int pre = 0;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=nums[pre])
                nums[++pre]=nums[i];
        }
        pre++;
        return pre;
    }

    @Test
    public void main() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}
