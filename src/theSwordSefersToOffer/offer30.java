package theSwordSefersToOffer;

import java.util.Stack;

public class offer30 {
    //包含min函数的栈
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            minStack.push(x>minStack.peek()?minStack.peek():x);
            stack.push(x);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
