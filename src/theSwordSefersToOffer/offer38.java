package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class offer38 {//字符串的排列
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Set<String> set = new HashSet<>();
        boolean[] flag = new boolean[s.length()];
        function(set,new StringBuilder(),chars,flag);
        String[] strs = new String[set.size()];
        return set.toArray(strs);
    }

    void function(Set<String> set,StringBuilder stringBuilder,char[] chars,boolean[] flag){
        if(stringBuilder.length()==chars.length){
            set.add(stringBuilder.toString());
            return;
        }
        for(int i = 0;i<chars.length;i++){
            if(!flag[i]){
                stringBuilder.append(chars[i]);
                flag[i] = true;
                function(set,stringBuilder,chars,flag);
                flag[i] = false;
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
    }
    @Test
    public void main() {
        System.out.println(Arrays.toString(permutation("abc")));
    }

}
