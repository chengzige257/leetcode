package easy;

public class easy160 {//相交链表

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
//执行耗时:6 ms,击败了19.90% 的Java用户
//内存消耗:44.5 MB,击败了10.01% 的Java用户
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> set = new HashSet<>();
//        while(headA!=null){
//            set.add(headA);
//            headA=headA.next;
//        }
//
//        while(headB!=null){
//            if(!set.add(headB)){
//                return headB;
//            }
//            headB=headB.next;
//        }
//        return null;
//    }

//双指针100%，官方题解
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;//这样走最后一定相交或则同时为null
        }
        return pA;
    }


}
