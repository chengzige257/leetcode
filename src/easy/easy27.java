import org.testng.annotations.Test;

public class easy27 {
    @Test
    public void main() {
        int[] a = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a, 2));
    }
    public int removeElement(int[] nums, int val) {
        int top = 0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=val)
                nums[top++]= nums[i];
        }
        return top;
    }
}
