package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer12 {//矩阵中的路径
    public boolean exist(char[][] board, String word) {

        char c = word.charAt(0);
        int m = board.length;
        int n = board[0].length;
        boolean[][] flag = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(c==board[i][j]&&back(board,1,word,flag,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean back(char[][] board,int index,String word,boolean[][] flag,int x,int y){
        flag[x][y] = true;
        if(index==word.length()){
            return true;
        }
        char c = word.charAt(index);
        if(x-1>=0&&!flag[x-1][y]&&c==board[x-1][y]){
            if(back(board,index+1,word,flag,x-1,y)){
                return true;
            }
        }
        if(x+1<board.length&&!flag[x+1][y]&&c==board[x+1][y]){
            if(back(board,index+1,word,flag,x+1,y)){
                return true;
            }
        }
        if(y+1<board[0].length&&!flag[x][y+1]&&c==board[x][y+1]){
            if(back(board,index+1,word,flag,x,y+1)){
                return true;
            }
        }
        if(y-1>=0&&!flag[x][y-1]&&c==board[x][y-1]){
            if(back(board,index+1,word,flag,x,y-1)){
                return true;
            }
        }
        flag[x][y] = false;
        return false;
    }
    @Test
    public void main() {
//        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println(exist(new char[][]{{'A', 'B'}}, "BA"));
    }
}
