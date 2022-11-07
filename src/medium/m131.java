package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m131 {//分割回文串
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();
        back(s,s1,lists,list,0);
        return lists;
    }
    public void back(String s, String s1, List<List<String>> lists, List<String> list, int start){
        if(start>=s.length()){
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i<s.length();i++){
            if(is(s,s1,start,i)){
                list.add(s.substring(start,i+1));
                back(s,s1,lists,list,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean is(String s,String s1,int start,int end){
        if(end==start){
            return true;
        }
        return s.substring(start,end+1).equals(s1.substring(s.length()-end-1,s.length()-start));
    }
    @Test
    public void main() {
        List<List<String>> aab = partition("aab");
        System.out.println();
    }
}
