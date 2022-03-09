import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class easy589 {//N叉树的前序遍历

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
//    public List<Integer> preorder(Node root) {//45%
//        if(root==null)
//            return new ArrayList<>();
//        List<Integer> list = new ArrayList<>();//频繁的new耗费时间
//        list.add(root.val);
//        for (Node child : root.children) {
//            list.addAll(preorder(child));
//        }
//        return list;
//    }


    public List<Integer> preorder(Node root) {//100%
        List<Integer> list = new ArrayList<>();//new 一次，然后传递参数节约时间
        dns(list,root);
        return list;
    }

    private void dns(List<Integer> list, Node root) {//
        if (root == null)return;
        list.add(root.val);
        if (root.children!=null){
            for (int i=0; i<root.children.size(); i++){
                dns(list,root.children.get(i));
            }
        }
    }


    @Test
    public static void main(String[] args) {

    }
}
