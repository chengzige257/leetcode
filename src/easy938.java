import java.util.Stack;

public class easy938 {
    //二叉搜索树的范围和

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

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop();
            if(current.val>=low&&current.val<=high)
                sum = sum+current.val;
            if(current.left!=null)
                stack.push(current.left);
            if(current.right!=null)
                stack.push(current.right);
        }
        return sum;
    }
}
