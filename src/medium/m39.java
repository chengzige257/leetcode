package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        back(list,result,0,candidates,target,0);
        return result;
    }

    boolean back(List<Integer> list,List<List<Integer>> result,int curSum,int[] array,int target,int index){
        if(curSum>target){
            return false;
        }
        if(curSum==target){
            result.add(new ArrayList<>(list));
        }
        for(int i = index;i<array.length;i++){
            if(curSum+array[i]>target)
                return false;

            list.add(array[i]);
            if(back(list, result, curSum+array[i], array, target,i)){
                return true;
            }
            list.remove(list.size()-1);
        }
        return false;
    }
    @Test
    public void main() {
        List<List<Integer>> list = combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(list);

    }
}
