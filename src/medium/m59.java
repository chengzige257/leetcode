package medium;

public class m59 {//螺旋矩阵
    public int[][] generateMatrix(int n) {
        int[][] array= new int[n][n];
        int count = 1;
        int direction = 0;
        int x = 0;
        int y = 0;
        array[0][0] = count++;
        while(count<=n*n){
            if(direction == 3 && (x == 0 || array[x - 1][y] != 0)){
                direction = 0;
            }

            if(direction == 2 && (y == 0 || array[x][y - 1] != 0)){
                direction = 3;
            }

            if(direction == 1 && (x+1==n||x+1<n && array[x+1][y] != 0)){
                direction = 2;
            }

            if(direction == 0 && (y+1==n||y+1<n && array[x][y+1] != 0)){
                direction = 1;
            }
            if(direction==0){
                y++;
            }
            if(direction==1){
                x++;
            }
            if(direction == 2){
                y--;
            }
            if(direction==3){
                x--;
            }
            array[x][y] = count++;
        }
        return array;
    }

}
