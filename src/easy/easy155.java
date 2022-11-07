package easy;

import org.testng.annotations.Test;

import java.util.*;

public class easy155 {
//    class MinStack {97%
//        Deque<Integer> xStack;
//        Deque<Integer> minStack;
//
//        public MinStack() {
//            xStack = new LinkedList<Integer>();
//            minStack = new LinkedList<Integer>();
//            minStack.push(Integer.MAX_VALUE);
//        }
//
//        public void push(int x) {
//            xStack.push(x);
//            minStack.push(Math.min(minStack.peek(), x));
//        }
//
//        public void pop() {
//            xStack.pop();
//            minStack.pop();
//        }
//
//        public int top() {
//            return xStack.peek();
//        }
//
//        public int getMin() {
//            return minStack.peek();
//        }
//    }
    class MinStack {//100%

        private final int INIT_SIZE = 100;

        private int[] elements;
        private int size;
        private int min;    /* 维护一个最小值 */
        private int minCount;


        /** initialize your data structure here. */
        public MinStack() {
            elements = new int[INIT_SIZE];
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            ensureCapacity();       /* 扩容检测 */
            elements[size++] = x;
            /* 维护最小值 */
            if(x < min) {
                min = x;
                minCount = 1;
            } else if(x == min) {
                minCount++;
            }
        }

        public void pop() {
            var popNum = elements[--size]; /* 被删除的数 */
            /* 维护最小值 */
            if(popNum == min && --minCount == 0) {
                min = Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    min = Math.min(min, elements[i]);
                }
                minCount = 1;
            }
        }

        public int top() {
            return elements[size - 1];
        }

        public int getMin() {
            return min;  /* 直接返回最小值 */
        }

        /**
         * 是否需要扩容
         */
        private void ensureCapacity() {
            if(size >= elements.length - 1) {
                elements = Arrays.copyOf(elements, elements.length + (elements.length >> 1));
            }
        }

    }

    @Test
    public void main() {
        int[] a = new int[]{1,2,3,4,4,5,5,6,6,6,7,7};
        System.out.println(a.length);
        a = Arrays.copyOf(a, 10);//第二个参数是新容量，如果比原容量大，则扩展，反之，则去除后面多余的内容（尾巴删掉，比如{1,2,3,4,4,5,5,6,6,6,7,7}变{1,2,3,4,4,5,5,6,6,6）
        System.out.println(a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
