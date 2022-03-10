package medium;

import org.testng.annotations.Test;

public class m63 {//不同路径Ⅱ

//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {//递归超时
//        int x = obstacleGrid.length;
//        int y = obstacleGrid[0].length;
//        return find(obstacleGrid, x - 1, y - 1);
//    }
//
//    int find(int[][] obstacleGrid, int x, int y) {
//        if (obstacleGrid[x][y] == 1) {
//            return 0;
//        }
//        if (x == 0 && y == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return find(obstacleGrid, 0, y - 1);
//        }
//        if (y == 0)
//            return find(obstacleGrid, x - 1, 0);
//        return find(obstacleGrid,x,y-1)+find(obstacleGrid,x-1,y);
//    }


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {//动态规划100%
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] != 0)
                arr[0] = 0;
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    arr[j] = arr[j] + arr[j - 1];
                }else{
                    arr[j] = 0;
                }
            }

        }
        return arr[n-1];
    }

    @Test
    public void main() {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
