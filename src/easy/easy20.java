package easy;

import org.testng.annotations.Test;

import java.util.Stack;

public class easy20 {
    public boolean isValid(String s) {
        if("".equals(s.trim()))
            return true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else {
                if (!stack.empty()){
                    if(c==')'&&stack.peek()=='('){
                        stack.pop();
                    }else if(c==']'&&stack.peek()=='['){
                        stack.pop();
                    }else if(c=='}'&&stack.peek()=='{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else
                    return false;
            }

        }

        return stack.empty();
    }
    @Test
    public void main() {
        System.out.println(isValid("[][]]{{}}({})"));
    }
}
