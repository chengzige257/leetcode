package medium;

import org.testng.annotations.Test;

public class m64 {//最小路径和
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[n];
        for(int i = 0;i<m;i++){
            arr[0] = arr[0]+grid[i][0];
            for(int j = 1;j<n;j++){
                if(i==0){
                    arr[j] = arr[j-1]+grid[0][j];
                }else
                    arr[j] = Math.min(arr[j],arr[j-1])+grid[i][j];
            }
        }
        return arr[n-1];
    }
    @Test
    public void main() {
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
