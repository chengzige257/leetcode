public class easy566 {//重塑矩阵
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int a = 0;
        int b = 0;
        int[][] reshape = new int[r][c];
        int m = mat.length;
        int n= mat[0].length;
        if(r*c!=m*n)
            return mat;
        for(int i= 0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                reshape[a][b++]=mat[i][j];
                if(b==c){
                    a++;
                    b = 0;
                    if(a==r)
                        return reshape;
                }
            }
        }
        return reshape;
    }
}
