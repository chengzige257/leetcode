package bean;
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){};
    public ListNode(int x) { val = x; }

    public ListNode(int i, ListNode node1) {
        next = node1;
        val = i;
    }
}
