import org.testng.annotations.Test;

public class easy203 {//移除链表元素

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        while(head!=null&&head.val==val)
            head = head.next;
        if(head==null)
            return null;
        ListNode p = head.next;
        ListNode pre = head;
        while(p!=null){
            if(p.val==val){
                pre.next = p.next;
            }else{
                pre=pre.next;
            }
            p=p.next;
        }
        return head;
    }


    @Test
    public void main() {
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = new ListNode(7,listNode1);
        ListNode listNode3 = new ListNode(7,listNode2);
        ListNode listNode4 = new ListNode(7,listNode3);
        ListNode listNode5 = new ListNode(7,listNode4);
        ListNode listNode = removeElements(listNode5, 7);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
