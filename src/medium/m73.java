package medium;

import java.util.HashSet;
import java.util.Set;

public class m73 {//矩阵置零
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }

        for (Integer integer : set1) {
            for(int i = 0;i<n;i++){
                matrix[integer][i] = 0;
            }
        }
        for (Integer integer : set2) {
            for(int i = 0;i<m;i++){
                matrix[i][integer] = 0;
            }
        }
    }
}
