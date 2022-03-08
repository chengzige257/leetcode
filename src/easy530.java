public class easy530 {//二叉搜索树的最小绝对差
    int pre;
    int min;
    public int getMinimumDifference(easy783.TreeNode root){
        pre = -1;
        min = Integer.MAX_VALUE;
        dfs(root);
        return min;
    }

    void dfs(easy783.TreeNode root){
        if(root==null)
            return;
        dfs(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }

}
