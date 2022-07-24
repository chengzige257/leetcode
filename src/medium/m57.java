package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals==null||intervals.length==0)
            return new int[][]{newInterval};
        List<int[]> list = new ArrayList<>();
        int length = intervals.length;
        int i = 0;
        while(i<length&&(intervals[i][1]<newInterval[0])){
            list.add(intervals[i]);
            i++;
        }
        int x = newInterval[0];
        int y = newInterval[1];
        while(i<length&&intervals[i][0]<=newInterval[1]&&intervals[i][1]>=newInterval[0]){
            x = Math.min(x,intervals[i][0]);
            y = Math.max(y,intervals[i][1]);
            i++;
        }
        list.add(new int[]{x,y});
        while(i<length){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
    @Test
    public void main() {
        insert(new int[][]{{1,5}},new int[]{4,8});
    }
}
