package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class offer29 {//顺时针打印矩阵

    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;

        int length = m * n;
        int[] result = new int[length];
        boolean[][] flag = new boolean[m][n];
        direction currentDirection = direction.right;
        int curX = 0;
        int curY = 0;
        int curIndex = 0;
        for (int i = 0; i < length; i++) {
            result[curIndex++] = matrix[curX][curY];
            flag[curX][curY] = true;
            if (currentDirection == direction.right) {
                if (curY == n - 1 || flag[curX][curY + 1] ) {
                    curX = curX + 1;
                    currentDirection = direction.down;
                }else{
                    curY++;
                }
            }else if(currentDirection == direction.down) {
                if(curX == m-1||flag[curX+1][curY]){
                    curY =curY -1;
                    currentDirection = direction.left;
                }else{
                    curX++;
                }
            }else if(currentDirection ==direction.left){
                if(curY==0||flag[curX][curY-1]){
                    curX = curX-1;
                    currentDirection = direction.up;
                }else{
                    curY--;
                }
            }else{
                if(flag[curX-1][curY]){
                    curY = curY+1;
                    currentDirection = direction.right;
                }else{
                    curX--;
                }
            }
        }
        return result;
    }

    enum direction {
        up,
        down,
        left,
        right
    }
    @Test
    public void main() {
        System.out.println(Arrays.toString(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
