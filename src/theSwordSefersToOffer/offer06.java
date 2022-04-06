package theSwordSefersToOffer;

import mians.ListNode;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

public class offer06 {//从尾到头打印链表
    public int[] reversePrint(ListNode head) {
        ListNode p = head;
        int[] a = new int[10000];
        Stack<ListNode> stack =new Stack<>();
        while(p!=null){
            stack.push(p);
            p = p.next;
        }
        int i = 0;
        while(!stack.isEmpty()){
            ListNode pop = stack.pop();
            a[i++] = pop.val;
        }
        return Arrays.copyOfRange(a,0,i);
    }
    @Test
    public void main() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode3;
        listNode3.next = listNode2;
        int[] ints = reversePrint(listNode1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
