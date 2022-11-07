package easy;

import java.util.Stack;

public class easy700 {//二叉搜索树的搜索
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while(p!=null||!stack.empty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                p = stack.pop();
                if(p.val==val){
                    return p;
                }else if(p.val>val){
                    return null;
                }
                p = p.right;
            }
        }
        return null;
    }
}
