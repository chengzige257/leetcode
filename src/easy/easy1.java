import java.util.HashMap;
import java.util.Map;

public class easy1 {
    //两数之和
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int temp;
        for(int i=0;i<nums.length;i++){
            temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{i,map.get(temp)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
