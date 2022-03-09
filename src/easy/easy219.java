import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class easy219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Math.min(nums.length,k);
        for(int i=0;i<min;i++){
            if(map.put(nums[i],i)!=null){
                return true;
            }
        }

        for(int i=k;i<nums.length;i++){
            Integer put = map.put(nums[i], i);
            if(put!=null){
                if(i-put<=k)
                    return true;
            }
        }
        return false;
    }


    @Test
    public void main() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 4,1}, 3));
    }
}
