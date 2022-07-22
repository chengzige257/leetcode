package medium;

import org.testng.annotations.Test;

public class m36 {//有效的数独
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row  = new boolean[9][9];
        boolean[][] col  = new boolean[9][9];
        boolean[][] block  = new boolean[9][9];
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'1';
                    int k = i/3*3+j/3;
                    if(row[i][num]||col[j][num]||block[k][num])
                        return false;
                    row[i][num] = true;
                    col[j][num] = true;
                    block[k][num] = true;
                }
            }
        }
        return true;
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
        System.out.println(isValidSudoku(a));
    }
}
