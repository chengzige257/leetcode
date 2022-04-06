package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer04 {//二维数组中的查找
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||(matrix.length==1&&matrix[0].length==0)){
            return false;
        }
        return find(matrix,target,0,0, matrix.length-1, matrix[0].length-1);
    }
    boolean find(int[][] matrix, int target,int startX,int startY,int endX,int endY){
        if(startX>endX||endX>=matrix.length||startY>endY||endY>=matrix[0].length)
            return false;
        if(startX==endX&&startY==endY)
            return matrix[startX][startY]==target;
        if(endX-startX==1&&endY==startY){
            return matrix[startX][endY]==target||matrix[endX][endY]==target;
        }
        if(endY-startY==1&&endX==startX){
            return matrix[startX][endY]==target||matrix[startX][startY]==target;
        }
        if(endX-startX==1&&endY-startY==1){
            return matrix[startX][startY]==target||matrix[endX][endY]==target||matrix[startX][endY]==target||matrix[endX][startY]==target;
        }
        int mX = (startX+endX)/2;
        int mY = (startY+endY)/2;
        if(target==matrix[mX][mY]){
            return true;
        }else if(target>matrix[mX][mY]){
            return find(matrix,target,mX+1,mY+1,endX,endY)||find(matrix,target,startX,mY+1,mX,endY)||find(matrix,target,mX+1,startY,endX,mY);
        }else{
            return find(matrix,target,startX,startY,mX-1,mY-1)||find(matrix,target,mX,startY,endX,mY-1)||find(matrix,target,startX,mY,mX-1,endY);
        }
    }
    @Test
    public void main() {
        System.out.println(findNumberIn2DArray(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}}, 5));
//        System.out.println(findNumberIn2DArray(new int[][]{{1,3,5}}, 4));
//        int[][] a =new int[][]{{-5}};
//        System.out.println(a[0][0] == -5);
//        System.out.println(findNumberIn2DArray(new int[][]{{-5}}, 20));
    }
}
