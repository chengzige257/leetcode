package hard;

import bean.ListNode;
import org.testng.annotations.Test;

public class h25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
            return head;
        ListNode p = head;
        ListNode q = head;
        for(int i = 1;i<k;i++){
            if(q!=null)
                q = q.next;
            else
                return head;
        }
        reverseByGroup(p,q);
        ListNode tail = p;
        head = q;
        q = p;
        p = head;
        while(true){
            for(int i = 1;i<=k;i++){
                if(q.next!=null){
                    p = p.next;
                    q = q.next;
                }
                else
                    return head;
            }
            reverseByGroup(p,q);
            tail.next = q;
            tail = p;
            p = q;
            q = tail;
        }
    }

    void reverseByGroup(ListNode head,ListNode tail){
        ListNode p = head;
        ListNode q = tail.next;
        ListNode next = p.next;
        while(next!=tail.next){
            p.next = q;
            q = p;
            p = next;
            next = next.next;
        }
        p.next = q;
    }
    @Test
    public void main() {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4,node1);
        ListNode node3 = new ListNode(3,node2);
        ListNode node4 = new ListNode(2,node3);
        ListNode node5 = new ListNode(1,node4);
        reverseKGroup(node5,2);
    }
}
