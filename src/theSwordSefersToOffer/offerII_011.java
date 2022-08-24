package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class offerII_011 {//0和1个数相同的子数组
    public int findMaxLength(int[] nums) {
        int[] ints = Arrays.stream(nums).map(a -> a == 0 ? -1 : 1).toArray();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int max = 0;
        for(int i = 0;i<ints.length;i++){
            sum+=ints[i];
            if(map.containsKey(sum)){
                max = Math.max(i-map.get(sum),max);
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }


    @Test
    public void main() {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 0, 0, 1}));

    }
}
