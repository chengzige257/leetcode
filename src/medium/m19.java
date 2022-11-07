package medium;

import bean.ListNode;
import org.testng.annotations.Test;

public class m19 {//删除链表的倒数第n个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        ListNode fast = head;
        for(int i = 1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null)
            return head.next;
        ListNode slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    @Test
    public void main() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode = removeNthFromEnd(listNode1, 2);
        System.out.println(listNode);
    }
}
