package easy;

import java.util.Stack;

public class easy2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        String case1 = "1->2->3->4->5";
        ListNode input = createListNodeByString(case1);
        printListNode(input);
        reorderList(input);
        printListNode(input);
    }

    public static ListNode createListNodeByString(String input) {
        String[] arr = input.split("->");
        ListNode node = new ListNode();
        ListNode cur = node;
        for (int i = 0; i < arr.length - 1; i++) {
            cur.val = Integer.parseInt(arr[i]);
            cur.next = new ListNode();
            cur = cur.next;
        }
        cur.val = Integer.parseInt(arr[arr.length - 1]);
        return node;
    }

    public static void printListNode(ListNode node) {
        String result = "";
        ListNode cur = node;
        while(cur != null) {
            result += "->" + cur.val;
            cur = cur.next;
        }
        result = result.substring(2);
        System.out.println(result);
    }

    public static void reorderList(ListNode head) {
        // write your code here
        ListNode p = head;
        Stack<ListNode> stack = new Stack<>();
        while(p!=null){
            stack.push(p);
            p = p.next;
        }
        ListNode first = head.next;
        ListNode last = stack.pop();
        ListNode current = head;
        int a = 0;
        while(!stack.isEmpty()&&first!=last){
            if(a%2==0){
                current.next = last;
                last = stack.pop();
            }else{
                current.next = first;
                first = first.next;
            }
            current = current.next;
            a++;
        }
        current.next = last;
    }
}
