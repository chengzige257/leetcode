package easy;

import org.testng.annotations.Test;

import java.util.Stack;

public class easy496 {
    //下一个更大元素I
    /**
     * 问题拆解：
     * 1.怎样找到nums2数组中所有元素的下一个大值。
     * 2.怎么找到数组1和数组二的对应关系
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 存储问题1.2的结果。
        //存放10的四次方个数字的下一个满足条件的值，构建对应关键。
        int[] temp = new int[10000];
        // 处理问题2借助的数据结构
        // 栈，如果里面的值小于当前值就将里面的值的下一个值赋值为当前值。判断结束将当前值push到栈。
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            int c = nums2[i];
            while (!stack.empty() && stack.peek() < c) {
                temp[stack.pop()] = c;
            }
            stack.push(c);
        }
        for (int i = 0; i < nums1.length; i++) {
            int c = temp[nums1[i]];
            if (c == 0) {
                c = -1;
            }
            nums1[i] = c;
        }
        return nums1;
    }



    @Test
    public void main() {


    }
}
