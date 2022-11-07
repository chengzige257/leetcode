package easy;

import org.testng.annotations.Test;

public class easy733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        if (image[sr][sc] != newColor) {
            dfs(image,sr,sc,newColor,image[sr][sc],m,n);
        }

        return image;
    }

    void dfs(int[][] image,int i,int j,int newColor,int color,int m,int n){
        if(i<0||j<0||i>=m||j>=n||image[i][j]!=color)
            return;
        image[i][j]=newColor;
        dfs(image,i-1,j,newColor,color,m,n);
        dfs(image,i+1,j,newColor,color,m,n);
        dfs(image,i,j-1,newColor,color,m,n);
        dfs(image,i,j+1,newColor,color,m,n);


    }

    @Test
    public void main() {
        int[][] ints = floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }
    }
}
