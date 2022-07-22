package medium;

import org.testng.annotations.Test;

public class m37 {//解数独
    boolean[][] row  = new boolean[9][9];
    boolean[][] col  = new boolean[9][9];
    boolean[][] block  = new boolean[9][9];
    int blank = 81;
    public void solveSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'1';
                    int k = i/3*3+j/3;
                    row[i][num] = true;
                    col[j][num] = true;
                    block[k][num] = true;
                    blank--;
                }
            }
        }
        back(board,0,0);
    }
    public boolean back(char[][] board,int currentI,int currentJ){
        if(blank==0)
            return true;
        int j = currentJ;
        for(int i = currentI;i<9;i++){
            for(;j<9;j++){
                if(board[i][j]=='.'){
                    blank--;
                    int k = i/3*3+j/3;
                    for(int a = 0;a<9;a++){
                        if(row[i][a]||col[j][a]||block[k][a]){
                        }else{
                            board[i][j] = (char)('1'+a);
                            row[i][a] = true;
                            col[j][a] = true;
                            block[k][a] = true;
                            if(back(board,i,j))
                                return true;
                            row[i][a] = false;
                            col[j][a] = false;
                            block[k][a] = false;
                        }
                    }
                    board[i][j]='.';
                    blank++;
                    return false;
                }
            }
            j=0;
        }
        return false;
    }


    @Test
    public void main() {
        char[][] a = new char[][]{{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(a);
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
