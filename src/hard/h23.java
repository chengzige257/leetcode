package hard;

import mians.ListNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class h23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null)
            return null;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for(int i = 0;i<lists.length;i++){
            if(lists[i]!=null)
                priorityQueue.offer(lists[i]);//添加
        }
        //priorityQueue.poll()移除并返回
        ListNode cur = null;
        ListNode head = priorityQueue.poll();
        ListNode pre = head;
        if(head==null)
            return null;
        if(head.next!=null){
            priorityQueue.offer(head.next);
        }
        while(priorityQueue.size()!=0){
            cur = priorityQueue.poll();
            pre.next = cur;
            if(cur.next!=null){
                priorityQueue.offer(cur.next);
            }
            pre = pre.next;
        }
        return head;
    }

    @Test
    public void main() {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        ListNode[] lists = new ListNode[1];
        lists[0] = listNode;
        ListNode listNode1 = mergeKLists(null);
        while(listNode1!=null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }

    }
}