package medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class m264 {
    public int nthUglyNumber(int n) {
        int[] array = new int[]{2,3,5};
        long min = 1L;
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        set.add(1L);
        for(int i = 2;i<=n;i++){
            for(int j = 0;j<array.length;j++){
                long cur = (long) array[j] *min;
                if(set.add(cur)){
                    priorityQueue.add(cur);
                }
            }
            min = priorityQueue.poll();
        }
        return (int) min;
    }
}
