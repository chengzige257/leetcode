package easy;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class easy141 {//环形链表
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
//    public boolean hasCycle(ListNode head) {//快慢指针100%
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow != fast) {
//            if (fast == null || fast.next == null) {
//                return false;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    @Test
    public void main() {

    }
}
