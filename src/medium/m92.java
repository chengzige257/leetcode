package medium;

import mians.ListNode;
import org.testng.annotations.Test;

import java.util.List;

public class m92 {//反转链表Ⅱ
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = head;
        ListNode p;
        ListNode q;
        for(int i = 1;i<left-1;i++){
            pre = pre.next;
        }
        if(left == 1){
            pre = null;
            p = head;
            q = p.next;
        }else{
            p = pre.next;
            q = p.next;
        }
        ListNode m = pre;
        ListNode n = p;
        for(int i = 1;i<=right-left+1;i++){
            p.next = pre;
            pre = p;
            p = q;
            if(p!=null)
                q = p.next;
        }
        if(m!=null)
            m.next = pre;
        n.next = p;
        return left==1?pre:head;
    }
    @Test
    public void main() {
        ListNode listNode = new ListNode(5);
        reverseBetween(listNode,1,1);
    }
}
