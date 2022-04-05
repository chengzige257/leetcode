package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        back(result,0,nums);
        return result;
    }

    public void back(List<List<Integer>> result,int current,int[] nums){

//        back(result,current+1,nums);
        for(int i=current;i<nums.length;i++){
            int swap = nums[current];
            nums[current] = nums[i];
            nums[i] = swap;
            if(current==nums.length-1)
                add(result,nums);
            back(result,current+1,nums);
            swap = nums[current];
            nums[current] = nums[i];
            nums[i] = swap;
        }
    }
    public void add(List<List<Integer>> result,int[] nums){
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        result.add(list);
    }
    @Test
    public void main() {
        List<List<Integer>> permute = permute(new int[]{1, 2, 3,4});
        System.out.println(permute);
    }


}
