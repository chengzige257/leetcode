import org.testng.annotations.Test;

import java.util.Stack;

public class easy897 {//递增顺序搜索树


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

    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode root1 = null;
        boolean flag = true;
        TreeNode current = null;
        while(p!=null||!stack.empty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                p = stack.pop();
                if(current!=null){
                    current.right = p;
                    current.left = null;
                    current = current.right;
                }
                if(flag){
                    flag = false;
                    root1 = p;
                    current = root1;
                }
                p = p.right;
            }

        }
        current.left = null;
        return root1;
    }

    @Test
    public void main() {

//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        TreeNode treeNode6 = new TreeNode(6);
//        TreeNode treeNode7 = new TreeNode(7);
//        TreeNode treeNode8 = new TreeNode(8);
//        TreeNode treeNode9 = new TreeNode(9);
//
//        treeNode5.left = treeNode3;
//        treeNode5.right = treeNode6;
//        treeNode3.left = treeNode2;
//        treeNode3.right = treeNode4;
//        treeNode6.right = treeNode8;
//        treeNode2.left = treeNode1;
//        treeNode8.left = treeNode7;
//        treeNode8.right = treeNode9;

//        TreeNode treeNode = increasingBST(treeNode5);

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode4;
        treeNode4.left = treeNode3;
        TreeNode treeNode = increasingBST(treeNode2);
        while(treeNode!=null){
            System.out.println(treeNode.val);
            treeNode = treeNode.right;
        }
    }
}
