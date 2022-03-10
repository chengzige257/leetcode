package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m22 {//括号生成
    public List<String> generateParenthesis(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = new ArrayList<>();
        backtrack(list,0,0,n,stringBuffer);
        return list;
    }

    void backtrack(List<String> list,int left,int right,int max,StringBuffer stringBuffer){
        if(stringBuffer.length()==2*max){
            list.add(stringBuffer.toString());
            return;
        }
        if(left<max){
            stringBuffer.append('(');
            backtrack(list,left+1,right,max,stringBuffer);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
        if(right<left){
            stringBuffer.append(')');
            backtrack(list,left,right+1,max,stringBuffer);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
    }
    @Test
    public void main() {
        List<String> strings = generateParenthesis(3);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
