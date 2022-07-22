package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        int[] visited = new int[nums.length];
        back(lists,nums,tem,visited);
        return lists;
    }
    void back(List<List<Integer>> lists,int[] nums,List<Integer> tem,int[] visited){
        int lastAdd = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(visited[i]==0){
                if(lastAdd==nums[i])
                    continue;
                tem.add(nums[i]);
                visited[i] = 1;
                if(tem.size()==nums.length){
                    lists.add(new ArrayList<>(tem));
                }
                back(lists, nums, tem, visited);
                lastAdd = tem.remove(tem.size() - 1);
                visited[i] = 0;
            }
        }
    }

    @Test
    public void main() {
        List<List<Integer>> lists = permuteUnique(new int[]{3,3,0,3});
        for(List list:lists){
            System.out.println(list);
        }
    }
}
