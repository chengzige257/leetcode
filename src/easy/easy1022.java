import org.testng.annotations.Test;

public class easy1022 {//从根到叶的二进制数之和
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
    public int sumRootToLeaf(TreeNode root) {
        int[] a = new int[1];
        dfs(root,0,a);
        return a[0];
    }

    void dfs(TreeNode root,int sum,int[] a){
        if(root==null)
            return ;
        if(root.left==null&&root.right==null){
            a[0]+=sum*2+root.val;
            return;
        }
        dfs(root.left,sum*2+root.val,a);
        dfs(root.right,sum*2+root.val,a);
    }
    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(0);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(0);
        TreeNode treeNode7 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        int i = sumRootToLeaf(treeNode1);
        System.out.println(i);
    }
}
