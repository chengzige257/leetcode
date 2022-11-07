package theSwordSefersToOffer;

import bean.TreeNode;

public class offer27 {//226 二叉树的镜像
    public TreeNode mirrorTree(TreeNode root) {
        mirror(root);
        return root;
    }

    public void mirror(TreeNode root){
        if(root==null)
            return;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        mirror(root.left);
        mirror(root.right);
    }
}