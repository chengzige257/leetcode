package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        if(length<4)
            return result;
        for(int i = 0;i<=length-4;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            for(int j = i+1;j<=length-3;j++){
                if(j>i+1&&nums[j]==nums[j-1])
                    continue;
                int m = j+1;
                int n = length-1;
                while(m<n){
                    if(n<length-1&&nums[n]==nums[n+1]){
                        n--;
                        continue;
                    }
                    if(m>j+1&&nums[m]==nums[m-1]){
                        m++;
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[m]+nums[n]>target){
                        n--;
                    }else if(nums[i]+nums[j]+nums[m]+nums[n]<target){
                        m++;
                    }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[m]);
                        list.add(nums[n]);
                        result.add(list);
                        m++;
                        n--;
                    }
                }
            }
        }
        return result;
    }
    @Test
    public void main() {
        List<List<Integer>> list = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(list);
    }
}
