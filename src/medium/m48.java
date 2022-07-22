package medium;

import org.testng.annotations.Test;

public class m48 {//旋转图像
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int x  = length/2;
        int y  = length/2;
        if(length%2==1)
            y = y-1;
        int[][] index = new int[4][2];
        for(int i = 0;i<=y;i++){
            for(int j = 0;j<=x;j++){
                index[0][0] = i;
                index[0][1] = j;
                index[1][0] = index[0][1];
                index[1][1] = length-1-index[0][0];
                index[2][0] = index[1][1];
                index[2][1] = length-1-index[1][0];
                index[3][0] = index[2][1];
                index[3][1] = length-1-index[2][0];
                int temp = matrix[index[0][0]][index[0][1]];
                matrix[index[0][0]][index[0][1]] = matrix[index[3][0]][index[3][1]];
                matrix[index[3][0]][index[3][1]] = matrix[index[2][0]][index[2][1]];
                matrix[index[2][0]][index[2][1]] = matrix[index[1][0]][index[1][1]];
                matrix[index[1][0]][index[1][1]] = temp;
            }
        }
    }
    @Test
    public void main() {

    }
}
