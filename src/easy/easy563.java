package easy;

public class easy563 {//二叉树的坡度

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
    int sum = 0;
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        dfs(root);


        return sum;
    }
    public int dfs(TreeNode root){
        if(root==null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        sum+=Math.abs(left-right);
        return left+right+root.val;
    }
}
