import java.util.Arrays;

public class easy225 {
    class MyStack {
        private final int INIT_SIZE = 100;
        int[] stack;
        int size;
        public MyStack() {
            size = 0;
            stack = new int[INIT_SIZE];
        }

        public void push(int x) {
            grow();
            stack[size++] = x;
        }

        public int pop() {
            return stack[--size];
        }

        public int top() {
            return stack[size-1];
        }

        public boolean empty() {
            return size==0;
        }
        public void grow(){
            if(size>=stack.length-1)
                Arrays.copyOf(stack,stack.length+(stack.length >> 1));
        }
    }



}
