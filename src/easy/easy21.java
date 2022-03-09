import org.testng.annotations.Test;

public class easy21 {
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


    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    @Test
    public void main() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        ListNode listNode = mergeTwoLists(l1, l4);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


