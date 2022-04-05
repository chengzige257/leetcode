package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if (length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i<=length-3; i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = length-1;
            while(j<k){
                if(k<length-1){
                    if(j>i+1&&nums[j]==nums[j-1]){
                        j++;
                        continue;
                    }
                    if(nums[k]==nums[k+1]){
                        k--;
                        continue;
                    }
                }
                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    k--;
                    j++;
                }
            }
        }
        return result;
    }
    @Test
    public void main() {
        int[] a = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> list = threeSum(a);
        System.out.println(list);
    }
}
