package hard;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class h51 {
    private List<String> AllCase;
    private final char Q = 'Q';
    private final char blank = '.';
    public List<List<String>> solveNQueens(int n) {
        AllCase = getAllCase(n);
        List<List<String>> lists = new ArrayList<>();
        back(lists,new ArrayList<>());
        return lists;
    }
    void back(List<List<String>> lists,ArrayList<String> builder){
        for(int i = 0;i<AllCase.size();i++){
            if(canAdd(builder,AllCase.get(i))){
                builder.add(AllCase.get(i));
                if(builder.size()==AllCase.size())
                    lists.add(new ArrayList<>(builder));
                back(lists,builder);
                builder.remove(builder.size()-1);
            }
        }
    }
    boolean canAdd(List<String> builder,String s){
        int X = builder.size();
        int Y = s.indexOf(Q);
        for(int i = 0;i<builder.size();i++){
            int y = builder.get(i).indexOf(Q);
            if(Y==y||X-Y==i-y||Y+X==i+y)
                return false;
        }
        return true;
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
    @Test
    public void main() {
        List<List<String>> lists = solveNQueens(4);
        System.out.println(lists);
    }
}
