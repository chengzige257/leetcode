import org.testng.annotations.Test;

public class easy671 {//二叉树中第二小的节点

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

    public int findSecondMinimumValue(TreeNode root) {
        int[] max = new int[]{-1,-1};
        dfs(root,max);
        return max[1];
    }
    void dfs(TreeNode root,int[] max){
        if(root==null)
            return;

        if(root.left==null){
            if(max[0]==-1){
                max[0] = root.val;
            } else if(root.val!=max[0]&&max[1]==-1){
                max[1] = root.val;
                swap(max);
            } else if(root.val < max[0]){
                max[1] = max[0];
                max[0] = root.val;
            } else if(root.val<max[1]&&root.val!=max[0]){
                max[1] = root.val;
            }
            return;
        }
        dfs(root.left,max);
        dfs(root.right,max);
    }
    void swap(int[] a){
        if(a[0]>a[1]){
            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
    }

    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(findSecondMinimumValue(treeNode1));
    }
}
