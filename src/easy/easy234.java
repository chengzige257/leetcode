package easy;

public class easy234 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

//方法一
//    public boolean isPalindrome(ListNode head) {
//        if (head == null) {
//            return true;
//        }
//
//        // 找到前半部分链表的尾节点并反转后半部分链表
//        ListNode firstHalfEnd = endOfFirstHalf(head);
//        ListNode secondHalfStart = reverseList(firstHalfEnd.next);//无论奇数偶数，firstHalfEnd.next都是后半链表的第一个节点
//
//        // 判断是否回文
//        ListNode p1 = head;
//        ListNode p2 = secondHalfStart;
//        boolean result = true;
//        while (result && p2 != null) {
//            if (p1.val != p2.val) {
//                result = false;
//            }
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//
//        // 还原链表并返回结果
//        firstHalfEnd.next = reverseList(secondHalfStart);
//        return result;
//    }
//
//    private ListNode reverseList(ListNode head) {//翻转链表
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }
//
//    private ListNode endOfFirstHalf(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast.next != null && fast.next.next != null) {
//            fast = fast.next.next;//奇数：快指针到最后一个节点，满指针到中间一个节点
//            slow = slow.next;//偶数：快指针到倒数第二个节点，满指针到前半部分最后一个节点
//        }
//        return slow;
//    }
    //方法二
//    public boolean isPalindrome(ListNode head) {
//        if(head == null || head.next == null) {
//            return true;
//        }
//        ListNode slow = head, fast = head;
//        ListNode pre = head, prepre = null;
//        while(fast != null && fast.next != null) {
//            pre = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//            pre.next = prepre;
//            prepre = pre;
//        }
//        if(fast != null) {
//            slow = slow.next;
//        }
//        while(pre != null && slow != null) {
//            if(pre.val != slow.val) {
//                return false;
//            }
//            pre = pre.next;
//            slow = slow.next;
//        }
//        return true;
//    }

    //方法三
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        //通过快慢指针找到中点
        while (fast != null && fast.next != null) {//奇数：快指针到最后一个节点，偶数：快指针null
            fast = fast.next.next;//奇数：满指针在中间节点，偶数：满指针在后半链表的第一个节点
            slow = slow.next;
        }
        //如果fast不为空，说明链表的长度是奇数个
        if (fast != null) {
            slow = slow.next;
        }
        //反转后半部分链表
        slow = reverse(slow);

        fast = head;
        while (slow != null) {
            //然后比较，判断节点值是否相等
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    //反转链表
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
