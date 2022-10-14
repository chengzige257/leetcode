package theSwordSefersToOffer;

import mians.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class offer52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set1 = new HashSet<>();
        Set<ListNode> set2 = new HashSet<>();
        while(headA!=null||headB!=null){
            if(headA!=null){
                set1.add(headA);
                if(set2.contains(headA))
                    return headA;
                headA = headA.next;
            }
            if(headB!=null){
                set2.add(headB);
                if(set1.contains(headB))
                    return headB;
                headB = headB.next;
            }
        }
        return null;
    }   
}
