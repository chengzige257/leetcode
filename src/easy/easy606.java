package easy;

import org.testng.annotations.Test;

public class easy606 {
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
    public String tree2str(TreeNode root) {
        StringBuffer dfs = dfs(root);
        return dfs.substring(1,dfs.length()-1);
    }

    StringBuffer dfs(TreeNode root){
        if(root==null)
            return null;
        StringBuffer left = dfs(root.left);
        StringBuffer right = dfs(root.right);
        if(left==null&&right==null)
            return new StringBuffer("(").append(root.val).append(')');
        if(left!=null&&right!=null)
            return new StringBuffer("(").append(root.val).append(left).append(right).append(')');
        if(right!=null)
            return new StringBuffer("(").append(root.val).append('(').append(')').append(right).append(')');
        return new StringBuffer("(").append(root.val).append(left).append(')');
    }

    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode3.right = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(tree2str(treeNode1));
    }
}
