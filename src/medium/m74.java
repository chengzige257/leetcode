package medium;

import org.testng.annotations.Test;

public class m74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int length = m*n;
        int left = 1;
        int right = length;
        int medium = (left+right)/2;
        while(left<right){
            if(matrix[(medium-1)/n][(medium%n)==0?(n-1):(medium%n-1)]==target)
                return true;
            else if(matrix[(medium-1)/n][(medium%n)==0?(n-1):(medium%n-1)]<target){
                left = medium+1;
                medium = (left+right)/2;
            }else{
                right = medium;
                medium = (left+right)/2;
            }
        }
        return target==matrix[(medium-1)/n][(medium%n)==0?(n-1):(medium%n-1)];
    }
    @Test
    public void main() {
        int[][] ints = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        searchMatrix(ints,13);
    }
}
