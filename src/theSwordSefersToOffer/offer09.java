package theSwordSefersToOffer;

import java.util.Stack;

public class offer09 {//用两个栈实现队列
    class CQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack1.size()==0){
                return -1;
            }
            while(stack1.size()!=1){
                stack2.push(stack1.pop());
            }
            int res = stack1.pop();

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return res;
        }
    }
}
