package theSwordSefersToOffer;

import mians.ListNode;

public class offer22 {//链表中倒数第k个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode last = head;
        for(int i = 1;i<=k;i++){
            pre = pre.next;
        }
        while(pre!=null){
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
