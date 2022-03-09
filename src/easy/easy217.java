import java.util.HashSet;
import java.util.Set;

public class easy217 {
    public boolean containsDuplicate(int[] nums) {//86%时间
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {//如果之前已经存在，set.add会返回false
                return true;
            }
        }
        return false;
    }



}
