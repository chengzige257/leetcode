package easy;

import bean.TreeNode;

public class easy101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null){
            return false;
        }
        return left.val==right.val&&check(left.left,right.right)&&check(right.left,left.right);
    }
}
