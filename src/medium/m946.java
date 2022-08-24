package medium;

import java.util.Stack;

public class m946 {//验证栈序列
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(popped==null||pushed==null||pushed.length!= popped.length)
            return false;
        if(popped.length==0)
            return true;
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(pushed[i++]);
        while(true){
            while(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
            if(j == popped.length)
                return true;
            else if(i==pushed.length)
                return false;
            while(i < pushed.length && (stack.isEmpty() || stack.peek() != popped[j])){
                stack.push(pushed[i++]);
            }
        }
    }
}
