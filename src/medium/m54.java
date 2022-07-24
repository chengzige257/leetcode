package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m54 {//螺旋矩阵
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null)
            return new ArrayList<>();
        int X = matrix.length;
        int Y = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int dx = 0;
        int dy = 1;
        int currentx = 0;
        int currenty = 0;
        for(int i = 1;i<=X*Y;i++){
            result.add(matrix[currentx][currenty]);
            matrix[currentx][currenty] = 111;
            if(currentx+dx>=X||currentx+dx<0||currenty+dy>=Y||currenty+dy<0||matrix[currentx+dx][currenty+dy] == 111){
                int temp = dx;
                dx = dy;
                dy = -temp;
            }
            currentx = currentx+dx;
            currenty = currenty + dy;
        }
        return result;
    }

    @Test
    public void main() {

    }
}
