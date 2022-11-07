package easy;

import org.testng.annotations.Test;

public class easyLCP44 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int numColor(TreeNode root) {
        int[] nums = new int[1001];
        left(root,nums);
        return nums[0];
    }

    void left(TreeNode root,int[] nums){
        if(root==null)
            return;
        if(nums[root.val]++==0)
            nums[0]++;
        left(root.left,nums);
        left(root.right,nums);
    }

    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode2;
        treeNode3.left = treeNode4;
        treeNode2.left = treeNode5;
        int i = numColor(treeNode1);
        System.out.println(i);

    }

}
