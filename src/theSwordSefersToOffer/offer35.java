package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class offer35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Map<Node,Node> map = new HashMap<>();
        Map<Node,Node> map1 = new HashMap<>();

        Node node = new Node(head.val);
        Node pre = node;
        map.put(head,node);
        map1.put(node,head);
        head = head.next;
        while(head!=null){
            Node current = new Node(head.val);
            pre.next = current;
            map.put(head,current);
            map1.put(current,head);
            pre = current;
            head = head.next;
        }
        pre = node;
        while(pre!=null){
            pre.random = map.get(map1.get(pre).random);
            pre=pre.next;
        }
        return node;
    }
    @Test
    public static void main(String[] args) {

    }
}
