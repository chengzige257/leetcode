package theSwordSefersToOffer;

import mians.ListNode;

public class offer25 {//合并两个排序的链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode p=list1;
        ListNode q=list2;
        ListNode head = new ListNode();
        ListNode current = head;
        while(true){
            if(p.val>q.val){
                current.next = q;
                if(q.next!=null)
                    q=q.next;
                else{
                    q.next = p;
                    break;
                }
            }else{
                current.next = p;
                if(p.next!=null)
                    p=p.next;
                else{
                    p.next = q;
                    break;
                }
            }
            current = current.next;
        }
        return head.next;
    }
    
}
