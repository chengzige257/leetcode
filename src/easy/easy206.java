public class easy206 {//反转链表
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
