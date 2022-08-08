package interview;

import org.testng.annotations.Test;

import java.util.*;

public class m16_22 {//兰顿蚂蚁
    class location{
        int x;
        int y;
        location(int x,int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            location location = (location) o;
            return x == location.x && y == location.y;
        }

//        @Override
//        public String toString() {
//            return "location{" +
//                    "x=" + x +
//                    ", y=" + y +
//                    '}';
//        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    int direction = 2;
    int curX = 0;
    int curY = 0;

    int minX = 0;//
    int maxX = 0;
    int minY = 0;//
    int maxY = 0;
    public List<String> printKMoves(int K) {
        Set<location> setBlack = new HashSet<>();
        for(int i = 1;i<=K;i++){
            location location = new location(curX, curY);
            if(setBlack.contains(location)){//当前位置是黑色
                direction = (direction+3)%4;
                setBlack.remove(location);
            }else{//当前位置是白色
                direction = (direction+1)%4;
                setBlack.add(location);
            }
            move();
        }
        int x = maxX-minX;
        int y = maxY-minY;
        char[][] chars= new char[y+1][x+1];
        for (location location : setBlack) {
            chars[location.y - minY][location.x - minX] = 'X';
        }
        if(direction==0)
            chars[curY-minY][curX-minX] = 'L';
        else if(direction==1)
            chars[curY-minY][curX-minX] = 'U';
        else if(direction==2)
            chars[curY-minY][curX-minX] = 'R';
        else
            chars[curY-minY][curX-minX] = 'D';
        List<String> list = new ArrayList<>();
        for(int i = y;i>=0;i--){
            for(int j = 0;j<x+1;j++){
                if(chars[i][j]==0)
                    chars[i][j] = '_';
            }
            list.add(new String(chars[i]));
        }
        return list;
    }
    void move(){
        if(direction==0){
            curX--;
            if(curX<minX){
                minX = curX;
            }
        }
        else if(direction==1){
            curY++;
            if(curY>maxY){
                maxY = curY;
            }
        }
        else if(direction==2){
            curX++;
            if(curX>maxX){
                maxX = curX;
            }
        }
        else{
            curY--;
            if(curY<minY){
                minY = curY;
            }
        }
    }
    @Test
    public void main() {
        List<String> strings = printKMoves(0);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
