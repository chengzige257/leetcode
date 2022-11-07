package easy;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class easy506 {//相对名次
//    public String[] findRelativeRanks(int[] score) {
//        int n = score.length;
//        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
//        int[][] arr = new int[n][2];
//
//        for (int i = 0; i < n; ++i) {
//            arr[i][0] = score[i];
//            arr[i][1] = i;
//        }
//        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
//        String[] ans = new String[n];
//        for (int i = 0; i < n; ++i) {
//            if (i >= 3) {
//                ans[arr[i][1]] = Integer.toString(i + 1);
//            } else {
//                ans[arr[i][1]] = desc[i];
//            }
//        }
//        return ans;
//    }


    private static final Map<Integer, String> RANKING = new HashMap<>();
    static {
        RANKING.put(1, "Gold Medal");
        RANKING.put(2, "Silver Medal");
        RANKING.put(3, "Bronze Medal");
    }

    public String[] findRelativeRanks(int[] score) {//优先队列
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < score.length; i++) {
            heap.offer(new int[] {i, score[i]});
        }

        String[] ans = new String[score.length];
        int rank = 1;
        while (!heap.isEmpty()) {
            int[] element = heap.poll();
            ans[element[0]] = RANKING.getOrDefault(rank, String.valueOf(rank++));
        }
        return ans;
    }


    @Test
    public void main() {
        String[] relativeRanks = findRelativeRanks(new int[]{1, 2, 3, 4, 5});
        for (String relativeRank : relativeRanks) {
            System.out.println(relativeRank);
        }
    }
}
