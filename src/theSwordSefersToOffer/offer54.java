package theSwordSefersToOffer;

import bean.TreeNode;

public class offer54 {
    public int kthLargest(TreeNode root, int k) {
        int[] a = new int[2];
        a[0] = k;
        dfs(root, a);
        return a[1];

    }
    public boolean dfs(TreeNode root,int[] k){
        if(root.right!=null&&dfs(root.right, k)){
            return true;
        }
        if(k[0]==1){
            k[1] = root.val;
            return true;
        }else{
            k[0]--;
        }
        return root.left != null && dfs(root.left, k);
    }
}

