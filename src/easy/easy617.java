import org.testng.annotations.Test;

public class easy617 {//合并二叉树

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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        dfs(root1,root2,null,0);
        return root1;
    }
    void dfs(TreeNode root1,TreeNode root2,TreeNode father,int a){
        if(root1==null&&root2==null)
            return;
        if(root1!=null&&root2!=null){
            root1.val = root1.val + root2.val;
            dfs(root1.left,root2.left,root1,0);
            dfs(root1.right,root2.right,root1,1);
            return;
        }
        if(root2!=null){
            root1 = new TreeNode(root2.val);
            if(a==0)
                father.left = root1;
            else if(a==1)
                father.right = root1;
            dfs(root1.left,root2.left,root1,0);
            dfs(root1.right,root2.right,root1,1);
            return;
        }
        dfs(root1.left,null,root1,0);
        dfs(root1.right,null,root1,1);


    }
    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode = mergeTrees(null, treeNode1);
        System.out.println(treeNode.val);
    }
}
