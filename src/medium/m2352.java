package medium;

import org.testng.annotations.Test;

public class m2352 {
    public int equalPairs(int[][] grid) {
        int length = grid.length;
        int res = 0;
        int[] a = new int[length];
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                a[j] = grid[j][i];
            }
            for(int j = 0;j<length;j++){
                if(fun(grid[j],a )){
                    res++;
                }
            }
        }
        return res;
    }
    public boolean fun(int[] a,int[] b){
        for(int i = 0;i<a.length;i++){
            if(a[i]!=b[i])
                return  false;
        }
        return true;
    }
    @Test
    public void main() {

    }
}
