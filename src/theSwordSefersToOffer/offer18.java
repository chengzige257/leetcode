package theSwordSefersToOffer;

import bean.ListNode;

public class offer18 {//删除链表的节点
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;
        ListNode p = head.next;
        ListNode pre = head;
        while(p!=null){
            if(p.val == val){
                pre.next = p.next;
                break;
            }
            p = p.next;
            pre = pre.next;
        }
        return head;
    }
}
