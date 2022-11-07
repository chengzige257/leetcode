package easy;

import org.testng.annotations.Test;

public class easy746 {
    //使用最小花费爬楼梯
//    int c;
//    public int minCostClimbingStairs(int[] cost) {//递归超时
//        c = cost.length;
//        return min(cost,-1);
//    }
//    int min(int[] cost,int n){
//        if(n==c-1)
//            return 0;
//        if(n==c-2)
//            return 0;
//        int a = min(cost,n+2)+cost[n+2];
//        int b = min(cost,n+1)+cost[n+1];
//        return Math.min(a,b);
//    }

    public int minCostClimbingStairs(int[] cost){
        int n= cost.length;
        int[] minCost = new int[n+1];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for(int i=2;i<n;i++){
            minCost[i] = Math.min(minCost[i-2],minCost[i-1])+cost[i];
        }
        return Math.min(minCost[n-1],minCost[n-2]);
    }
    @Test
    public void main() {
        int[] ints = {10,15,20};
        int i = minCostClimbingStairs(ints);
        System.out.println(i);
    }
}
