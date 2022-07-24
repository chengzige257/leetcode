package hard;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class h52 {
    public int totalNQueens(int n) {
        int[] array = new int[n];
        Set<Integer> set = new HashSet<>();
        int[] num = new int[1];
        back(array,n,set,0,num);
        return num[0];
    }
    void back(int[] array,int n,Set<Integer> set,int deep,int[] num){
        if(deep==n){
            num[0]++;
            return;
        }
        for(int i = 1;i<=n;i++){
            if(!set.contains(i)){
                set.add(i);
                array[deep] = i;
                boolean flag = false;
                for(int j=0;j<deep;j++){
                    if(array[j]-array[deep]==j-deep||array[j]-array[deep]==deep-j){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    set.remove(i);
                    array[deep] = 0;
                    continue;
                }
                back(array,n,set,deep+1,num);
                set.remove(i);
                array[deep] = 0;
            }
        }
    }

    @Test
    public void main() {
        System.out.println(totalNQueens(4));
    }
}
