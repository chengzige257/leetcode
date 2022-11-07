package easy;

import java.util.*;

public class easy872 {
    //叶子相似的树
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        TreeNode root = root1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Queue<Integer> queue = new LinkedList<>();
        while(!stack.empty()){
            TreeNode pop = stack.pop();
            if(pop.left==null&&pop.right==null)
                queue.add(pop.val);
            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null)
                stack.push(pop.left);
        }

        root = root2;
        stack.push(root);
        while(!stack.empty()){
            TreeNode pop = stack.pop();
            if(pop.left == null&&pop.right == null){
                if(queue.isEmpty() || queue.poll() != pop.val)
                    return false;
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null)
                stack.push(pop.left);
        }
        return queue.isEmpty();
    }

//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> seq1 = new ArrayList<Integer>();
//        if (root1 != null) {
//            dfs(root1, seq1);
//        }
//
//        List<Integer> seq2 = new ArrayList<Integer>();
//        if (root2 != null) {
//            dfs(root2, seq2);
//        }
//
//        return seq1.equals(seq2);
//    }
//
//    public void dfs(TreeNode node, List<Integer> seq) {
//        if (node.left == null && node.right == null) {
//            seq.add(node.val);
//        } else {
//            if (node.left != null) {
//                dfs(node.left, seq);
//            }
//            if (node.right != null) {
//                dfs(node.right, seq);
//            }
//        }
//    }
}
