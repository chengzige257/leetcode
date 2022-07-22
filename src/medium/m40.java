package medium;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Stream;

public class m40 {//组合总和2
    @Test
    public void main(){
        //14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12
        //27
        int[] a= new int[]{14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        List<List<Integer>> list = combinationSum2(a, 27);
        for(List list1: list){
            System.out.println(list1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        back(candidates,target,lists,list,0);
        return lists;
    }
    boolean back(int[] candidates,int target,List<List<Integer>> lists,List<Integer> list,int current){
        if(target==0){
            lists.add(new ArrayList<>(list));
            return true;
        }
        int lastAdd = Integer.MAX_VALUE;
        for(int i = current;i<candidates.length;i++){
            if(candidates[i]<=target){
                if(lastAdd==candidates[i])
                    continue;
                list.add(candidates[i]);
                back(candidates,target-candidates[i],lists,list,i+1);
                lastAdd  = list.remove(list.size() - 1);
            }else
                return false;
        }
        return false;
    }
}
