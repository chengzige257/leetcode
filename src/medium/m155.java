package medium;

import java.util.Stack;

public class m155 {

        private Stack<Long> stack = new Stack<>();
        private long min;

        public void push(int x) {
            long y = x;
            if (stack.isEmpty()) {
                min = y;
                stack.push(0L);
            } else {
                // 计算差值
                long compare = y - min;
                stack.push(compare);
                // 如果差值小于0，显然 x 成为最小值，否则最小值不变
                min = compare < 0 ? x : min;
            }
        }

        public void pop() {
            long top = stack.peek();
            // 如果top小于0，显然最小值也一并会被删除，此时更新最小值
            min = top < 0L ? (min - top) : min;
            stack.pop();
        }


        public int top() {
            Long peek = stack.peek();
            return (int)(peek<=0?min:min+peek);
        }
        public int getMin() {
            return (int) min;
        }

}
