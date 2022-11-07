package medium;

import bean.ListNode;

public class m24 {//两两交换链表中的节点
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
