package theSwordSefersToOffer;

import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.Stack;

public class offer26 {//树的子结构
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null){
            return B==null;
        }
        if(B==null)
            return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(A);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current.val==B.val&&isEqual(current,B)){
                return true;
            }
            if(current.left!=null)
                stack.push(current.left);
            if(current.right!=null){
                stack.push(current.right);
            }
        }
        return false;
    }
    boolean isEqual(TreeNode p,TreeNode q){
        if(p==null&&q!=null)
            return false;
        if(q==null){
            return true;
        }
        return q.val==p.val&&isEqual(p.left,q.left)&&isEqual(p.right,q.right);
    }

    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(-4);
        TreeNode treeNode5 = new TreeNode(-3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right = treeNode5;

        TreeNode treeNode7 = new TreeNode(-4);
        TreeNode treeNode6 = new TreeNode(1,treeNode7,null);
        System.out.println(isSubStructure(treeNode1, treeNode6));
    }
}
