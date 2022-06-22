package medium;

import jdk.jfr.StackTrace;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class m17 {//电话号码的字母组合
    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        StringBuilder sb = new StringBuilder("");
        List<String> result = new ArrayList<>();
        back(result,0,length,digits,sb);
        return result;
    }
    void back(List<String> result,int current,int length,String digits,StringBuilder sb){
        if(current==length)
            return ;
        char[] chars = getChars(Integer.parseInt(digits.substring(current,current+1)));
        for(int i = 0;i<chars.length;i++){
            sb.append(chars[i]);
            if(current+1==length)
                result.add(sb.toString());
            back(result,current+1,length,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    char[] getChars(int number){
        if(number==2){
            return new char[]{'a','b','c'};
        }else if(number==3){
            return new char[]{'d','e','f'};
        }else if(number==4){
            return new char[]{'g','h','i'};
        }else if(number==5){
            return new char[]{'j','k','l'};
        }else if(number==6){
            return new char[]{'m','n','o'};
        }else if(number==7){
            return new char[]{'p','q','r','s'};
        }else if(number==8){
            return new char[]{'t','u','v'};
        }else if(number==9){
            return new char[]{'w','x','y','z'};
        }
        return new char[0];
    }
    @Test
    public void main() {
        List<String> strings = letterCombinations("23");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
