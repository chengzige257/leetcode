package theSwordSefersToOffer;

public class offer47 {//礼物的最大价值
    public int maxValue(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[] dp = new int[y+1];
        for(int i = 1;i<=x;i++){
            for(int j = 1;j<=y;j++){
                dp[j] = Math.max(dp[j-1],dp[j])+grid[i-1][j-1];
            }
        }
        return dp[y];
    }
}
