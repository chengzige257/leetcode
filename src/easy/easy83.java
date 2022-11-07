package easy;

import org.testng.annotations.Test;

public class easy83 {//删除排序链表中的重复元素


    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode pre = head;
        ListNode p = head.next;
        while(p!=null){
            if(pre.val==p.val){
                pre.next=p.next;
                p=p.next;
                continue;
            }
            pre=pre.next;
            p=p.next;
        }
        return head;
    }


    @Test
    public void main() {

    }
}
