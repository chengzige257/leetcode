package medium;

import bean.Node;

import java.util.HashMap;
import java.util.Map;

public class m138 {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Map<Node, Node> map = new HashMap<>();
        Map<Node, Node> map1 = new HashMap<>();

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
}
