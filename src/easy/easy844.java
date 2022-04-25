package easy;

import org.testng.annotations.Test;

import java.util.Stack;

public class easy844 {//比较含退格的字符串


//    public boolean backspaceCompare(String S, String T) {
//        return build(S).equals(build(T));
//    }
//
//    public String build(String str) {
//        StringBuffer ret = new StringBuffer();
//        int length = str.length();
//        for (int i = 0; i < length; ++i) {
//            char ch = str.charAt(i);
//            if (ch != '#') {
//                ret.append(ch);
//            } else {
//                if (ret.length() > 0) {
//                    ret.deleteCharAt(ret.length() - 1);
//                }
//            }
//        }
//        return ret.toString();
//    }


    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='#'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        }
        Stack<Character> stack1 = new Stack<>();
        for(int i = 0;i<t.length();i++){
            char c= t.charAt(i);
            if(c=='#'){
                if(!stack1.empty()){
                    stack1.pop();
                }
            }else{
                stack1.push(c);
            }
        }
        if(stack.size()!=stack1.size()){
            return false;
        }

        while(!stack.empty()){
            if(stack.pop()!=stack1.pop()){
                return false;
            }
        }
        return true;

    }
    @Test
    public void main() {
        System.out.println(backspaceCompare("abcd", "bbcd"));
    }
}
