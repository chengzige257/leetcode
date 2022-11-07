package easy;

import bean.TreeNode;

public class easy226 {
    public TreeNode invertTree(TreeNode root) {
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
