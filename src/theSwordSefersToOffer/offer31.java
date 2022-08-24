package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Stack;

public class offer31 {
    //栈的压入弹出序列
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

    @Test
    public void main() {
        System.out.println(validateStackSequences(new int[]{0,1}, new int[]{0,1}));
    }
}
