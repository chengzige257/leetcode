package theSwordSefersToOffer;

import mians.ListNode;

public class offer24 {//反转链表
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode p =head;
        while(p!=null){
            ListNode next =p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return pre;
    }
}
