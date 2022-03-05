public class easy1290 {//二进制链表转整数
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head!=null){
            sum = sum*2+head.val;
            head = head.next;
        }
        return sum;
    }
}
