package hard;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class h51 {
    //解法1————8ms
//    private List<String> AllCase;
//    private final char Q = 'Q';
//    private final char blank = '.';
//    public List<List<String>> solveNQueens(int n) {
//        AllCase = getAllCase(n);
//        List<List<String>> lists = new ArrayList<>();
//        back(lists,new ArrayList<>());
//        return lists;
//    }
//    void back(List<List<String>> lists,ArrayList<String> builder){
//        for(int i = 0;i<AllCase.size();i++){
//            if(canAdd(builder,AllCase.get(i))){
//                builder.add(AllCase.get(i));
//                if(builder.size()==AllCase.size())
//                    lists.add(new ArrayList<>(builder));
//                back(lists,builder);
//                builder.remove(builder.size()-1);
//            }
//        }
//    }
//    boolean canAdd(List<String> builder,String s){
//        int X = builder.size();
//        int Y = s.indexOf(Q);
//        for(int i = 0;i<builder.size();i++){
//            int y = builder.get(i).indexOf(Q);
//            if(Y==y||X-Y==i-y||Y+X==i+y)
//                return false;
//        }
//        return true;
//    }
//    List<String> getAllCase(int n){
//        List<String> lists = new ArrayList<>(n);
//        StringBuilder stringBuilder = new StringBuilder(n);
//        for(int i = 0;i<n;i++){
//            stringBuilder.append(blank);
//        }
//        for(int i = 0;i<n;i++){
//            stringBuilder.setCharAt(i,Q);
//            lists.add(stringBuilder.toString());
//            stringBuilder.setCharAt(i,blank);
//        }
//        return lists;
//    }

    //解法二————3ms
    private final char Q = 'Q';
    private final char blank = '.';
    private List<String> AllCase;
    public List<List<String>> solveNQueens(int n) {
        int[] array = new int[n];
        Set<Integer> set = new HashSet<>();
        AllCase = getAllCase(n);
        List<List<String>> result = new ArrayList<>();
        back(array,n,set,0,result);
        return result;
    }
    List<String> getAllCase(int n){
        List<String> lists = new ArrayList<>(n);
        StringBuilder stringBuilder = new StringBuilder(n);
        for(int i = 0;i<n;i++){
            stringBuilder.append(blank);
        }
        for(int i = 0;i<n;i++){
            stringBuilder.setCharAt(i,Q);
            lists.add(stringBuilder.toString());
            stringBuilder.setCharAt(i,blank);
        }
        return lists;
    }
    void back(int[] array,int n,Set<Integer> set,int deep,List<List<String>> result){
        if(deep==n){
            List<String> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                list.add(AllCase.get(array[i]-1));
            }
            result.add(list);
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
                back(array,n,set,deep+1,result);
                set.remove(i);
                array[deep] = 0;
            }
        }
    }
    @Test
    public void main() {
        List<List<String>> lists = solveNQueens(4);
        System.out.println(lists);
    }
}
