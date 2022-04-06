package theSwordSefersToOffer;

import org.testng.annotations.Test;

public class offer13 {//机器人的运动范围
    public int movingCount(int m, int n, int k) {
        if(k==0){
            return 1;
        }
        boolean[][] move = new boolean[m][n];
        int[] count = new int[1];
        goNext(move,count,0,0,k);
        return count[0];
    }
    void goNext(boolean[][] move,int[] count,int x,int y,int k){
        if(is(x,y,k)){
            move[x][y] = true;
            count[0]++;
        }else{
            return;
        }
        if(x-1>=0&&!move[x-1][y]){
            goNext(move,count,x-1,y,k);
        }
        if(x+1<move.length&&!move[x+1][y]){
            goNext(move,count,x+1,y,k);
        }
        if(y-1>=0&&!move[x][y-1]){
            goNext(move,count,x,y-1,k);
        }
        if(y+1<move[0].length&&!move[x][y+1]){
            goNext(move,count,x,y+1,k);
        }
    }
    boolean is(int x,int y,int k){
        int sum = 0;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        while(y!=0){
            sum+=y%10;
            y/=10;
        }
        return sum<=k;
    }
    @Test
    public void main() {
//        System.out.println(is(20, 88,18));
        System.out.println(movingCount(2, 3, 1));
    }
}
