import org.testng.annotations.Test;

public class easy463 {//岛屿的周长

    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return dfs(i,j,grid,m,n);
                }
            }
        }
        return 0;
    }

    int dfs(int i,int j,int[][] grid,int m,int n){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0)
            return 1;
        if(grid[i][j]==2)
            return 0;
        grid[i][j]=2;
        int res = 0;
        for(int k=0;k<4;k++){
            int tx = i+dx[k];
            int ty = j+dy[k];
            res+=dfs(tx,ty,grid,m,n);
        }
        return res;
    }

//    public int islandPerimeter(int[][] grid) {
//        // 举例推导出公式 res = 4 * 岛屿格子数量 - 2 * 岛屿格子之间的相邻边
//        int m = 0, n= 0;
//        if(grid == null || (m = grid.length) == 0 || (n = grid[0].length) == 0) return 0;
//
//        int count = 0; // 岛屿格子数量
//        int edge = 0; // 岛屿格子之间的相邻边
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                if(grid[i][j] == 0) continue;
//                count++;
//
//                if(j+1 < n && grid[i][j+1] == 1)    edge++; // 判断右边是不是 陆地格子
//
//                if(i+1 < m && grid[i+1][j] == 1)    edge++; // 判断下面是不是 陆地格子
//            }
//        }
//
//        return 4 * count - 2 * edge;
//    }

    @Test
    public void main() {
//        System.out.println(islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
//        System.out.println(islandPerimeter(new int[][]{{0}, {1}}));

    }

}
