package theSwordSefersToOffer;

public class offer36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    public Node treeToDoublyList(Node root) {//二叉搜索树与双向链表
        if(root==null){
            return null;
        }
        Node first = new Node();
        last = first;
        last.left = first;
        first.right = last;
        dfs(root);
        first = first.right;
        first.left = last;
        last.right = first;
        return first;
    }
    Node last;
    void dfs(Node root){
        if(root.left!=null){
            dfs(root.left);
        }

        last.right = root;
        root.left = last;
        last = root;

        if(root.right!=null){
            dfs(root.right);
        }

    }
}
